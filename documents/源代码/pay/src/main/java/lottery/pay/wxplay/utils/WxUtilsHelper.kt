package lottery.pay.wxplay.utils


import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.io.naming.NoNameCoder
import com.thoughtworks.xstream.io.xml.StaxDriver
import java.lang.reflect.Modifier
import java.util.*

/**
 * 微信支付工具
 */
object  WxUtilsHelper{


    /**
     * 将对象转换成安写信支付顺序的字符串
     */
    @Throws(Exception::class)
    fun toRequestParamsStr(params:Any): String {
        val filedMap = getParamsMapFromObject(params, LinkedHashMap::class.java, true)

        val it = filedMap!!.entries.iterator()
        var params_info = ""
        while (it.hasNext()) {
            val entry = it.next()
            if (entry.value==null ||entry.value=="")continue
            if (it.hasNext()) {
                params_info += (if (entry.key=="packaged") "package" else entry.key) + "=" + entry.value + "&"

            } else {
                params_info += entry.key + "=" + entry.value

            }
        }

        return params_info
    }

    /**
     * 将对象转换为Map对象
     */
    private fun getParamsMapFromObject(obj: Any?, mClazz: Class<out LinkedHashMap<*, *>>, nonNull: Boolean): Map<String, Any>? {
        var map: LinkedHashMap<String, Any>? = null
        try {
            map = LinkedHashMap()
            if (obj == null) {

            } else {

                val fieldMap = getClassFields(LinkedHashMap::class.java, obj.javaClass, true)

                val it = fieldMap!!.entries.iterator()

                while (it.hasNext()) {
                    var key: String? = null
                    var value: Any? = null
                    val entry = it.next()

                    key = entry.key
                    key = key.substring(key.lastIndexOf(".") + 1)

                    val getMethodName = (if (key.substring(0,2)=="is") key.substring(0, 1) else "get" +key.substring(0, 1).toUpperCase() )  +key.substring(1, key.length)

                    val method = obj.javaClass.getMethod(getMethodName)

                    value = method.invoke(obj)
                    if (nonNull && value == null) {

                    } else {
                        map!!.put(key, value)
                    }
                    /*}*/
                }
            }

        } catch (e: Exception) {
            // TODO: handle exception
            e.printStackTrace()
        }

        return map
    }


    /**
     * 替换url中的参数
     * @param str
     * @param regex
     * @param args
     * @return {String}
     */
    fun replace(str: String, regex: String, vararg args: String): String {
        var str = str
        val length = args.size
        for (i in 0..length - 1) {
            str = str.replaceFirst(regex.toRegex(), args[i])
        }
        return str
    }















    private fun getClassFields(mCLazz: Class<out Map<*, *>>, clazz: Class<*>,
                               includeParentClass: Boolean): Map<String, Class<*>>? {
        var map: HashMap<String, Class<*>>? = null
        try {
            map = mCLazz.newInstance() as HashMap<String, Class<*>>?
        } catch (e: InstantiationException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }

        val fields = clazz.declaredFields
        for (field in fields) {

            val filedName = field.name
            if (Modifier.isFinal(field.modifiers)) {
                continue
            }
            // int index = filedName.lastIndexOf(".");
            map!!.put(filedName, field.type)
        }
        if (includeParentClass)
            getParentClassFields(map!!, clazz.superclass)
        return map
    }

    /**
     * 获取类实例的父类的属性值
     *
     * @param map
     * 类实例的属性值Map
     * @param clazz
     * 类名
     * @return 类名.属性名=属性类型
     */
    private fun getParentClassFields(map: MutableMap<String, Class<*>>, clazz: Class<*>?): Map<String, Class<*>> {
        if (clazz == Any::class.java || clazz == null) {
            return map
        }
        val fields = clazz.declaredFields
        for (field in fields) {
            val filedName = field.name
            if (filedName.toLowerCase().indexOf("serialVersionUID".toLowerCase()) != -1) {
                continue
            }
            map.put(filedName, field.type)
        }
        if (clazz.superclass == Any::class.java) {
            return map
        }
        getParentClassFields(map, clazz.superclass)
        return map
    }

    /**
     * xml处理对象
     *
     */
    object  xml{

        fun toXml(obj: Any, header: String): String {

            val xStream = createXstream()
            xStream.alias(header, obj.javaClass)
            return xStream.toXML(obj)
        }

        @Throws(Exception::class)
        fun <T> fromXml(xml: String, clazz: Class<T>, header: String): Any? {

            val xStream = createXstream()
            xStream.processAnnotations(clazz)
            xStream.alias(header, clazz)
            val t = clazz.newInstance()
            return xStream.fromXML(xml, t)
        }


       private  fun createXstream(): XStream {

            return XStream(StaxDriver(NoNameCoder()))
        }



    }

}

private fun ByteArray.toString(v: String) {}


