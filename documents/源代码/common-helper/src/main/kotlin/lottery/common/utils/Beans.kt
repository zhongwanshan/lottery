package lottery.common.utils

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import org.springframework.cglib.beans.BeanCopier
import org.springframework.cglib.beans.BeanMap
import org.springframework.cglib.core.Converter
import java.util.concurrent.ConcurrentHashMap
import kotlin.reflect.KClass


/**
 * Bean转换工具
 * TODO：支持 内置 Converter
 */
object Beans {
    // copier的缓存
    private val CACHE = ConcurrentHashMap<String, BeanCopier>()
    private val MAPPER = ObjectMapper().apply {
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
    }

    /**
     * bean拷贝
     * @param from 数据源 bean
     * @param to 目标Bean的类
     * @return 目标 bean 的实例
     */
    @Throws(RuntimeException::class)
    fun <T : Any> copy(from: Any, to: KClass<T>): T {
        val target = to.java.newInstance() ?: throw RuntimeException("Cannot create instance of type '$to' ")
        getOrCreateCopier(from.javaClass.kotlin, to).apply { copy(from, target, null) }
        return target
    }

    /**
     * bean拷贝
     * @param from 数据源 bean
     * @param to 目标Bean的类
     * @param converter 转换器
     * @return 目标 bean 的实例
     */
    @Throws(RuntimeException::class)
    fun <T : Any> copy(from: Any, to: KClass<T>, converter: Beans.() -> Converter?): T {
        val target = to.java.newInstance() ?: throw RuntimeException("Cannot create instance of type '$to' ")
        val c = this.converter()
        val useConverter = if (c == null) false else true
        getOrCreateCopier(from.javaClass.kotlin, to, useConverter).apply { copy(from, target, c) }
        return target
    }

    /**
     * bean 拷贝
     * @param from 要拷贝的bean
     * @param to 目标bean
     */
    fun copy(from: Any, to: Any) {
        getOrCreateCopier(from.javaClass.kotlin, to.javaClass.kotlin).apply { copy(from, to, null) }
    }

    /**
     * 使用指定的转换器拷贝 bean
     * @param from 要拷贝的bean
     * @param to 目标 bean
     * @param converter 转换器
     *
     */
    fun copy(from: Any, to: Any, converter: Beans.() -> Converter?) {
        val c = this.converter()
        val useConverter = if (c == null) false else true
        getOrCreateCopier(from.javaClass.kotlin, to.javaClass.kotlin, useConverter).apply { copy(from, to, c) }
    }

    /**
     * 将Bean的数据存入map
     */
    fun map(bean: Any): Map<String, Any> {
        return BeanMap.create(bean) as Map<String, Any>
    }

    /**
     * 将Bean的数据存入Map，并过滤掉指定的属性。
     * @param bean 需要转入到map的bean
     * @param excludes 需要被过滤掉的属性名称
     */
    fun map(bean: Any, vararg excludes: String): Map<String, Any?> {
        val map = BeanMap.create(bean)
        if (excludes.isEmpty()) return map as Map<String, Any>
        val list = listOf(*excludes)
        val result = mutableMapOf<String, Any?>()
        map.forEach {
            if (!list.contains(it.key)) {
                result.put(it.key as String, it.value)
            }
        }
        return result
    }

    /**
     * 将Bean转换为Json
     */
    fun json(bean: Any): String {
        return MAPPER.writeValueAsString(bean)
    }

    /**
     * 将JSON转换为Bean
     */
    fun <T : Any> bean(json: String, type: Class<T>): T? {
        return MAPPER.readValue(json, type)
    }

    /**
     * 将一个map的数据存入bean
     */
    fun <T : Any> fromMap(clazz: Class<T>, map: Map<*, *>): T {
        val bean = clazz.newInstance()
        BeanMap.create(bean)?.putAll(map)
        return bean
    }

    /**
     * 从缓存获取一个 BeanCopier 实例，如果没有则创建之
     */
    private fun getOrCreateCopier(from: KClass<*>, to: KClass<*>, useConverter: Boolean = false): BeanCopier {
        val key = cacheKey(from, to, useConverter)
        return CACHE.getOrPut(key) {
            BeanCopier.create(from.java, to.java, useConverter)
        } ?: throw RuntimeException("Cannot get/create BeanCopier for classes '$key' ")
    }

    private fun cacheKey(from: KClass<*>, to: KClass<*>, useConverter: Boolean = false): String {
        return if (useConverter) "${from.qualifiedName}_${to.qualifiedName}.withConverter" else "${from.qualifiedName}_${to.qualifiedName}"
    }
}