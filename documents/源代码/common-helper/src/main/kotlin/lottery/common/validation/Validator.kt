package kotun.common.validation

import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.Validator
import javax.validation.groups.Default

/**
 * 校验工具类
 *
 */
object Validator {

    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator

    /**
     * 使用默认的组策略，对一个对象进行校验
     * @param obj 需要被校验的对象
     */
    fun <T> validate(obj: T): ValidateResult {
        val result = ValidateResult()
        val set: Set<ConstraintViolation<T>> = validator.validate(obj, Default::class.java)
        if (set.isNotEmpty()) {
            result.hasErrors = true
            set.forEach {
                result.errorMsg[it.propertyPath.toString()] = it.message
            }
        }
        return result
    }

    /**
     * 使用指定的组策略，对对象进行校验
     * @param obj 需要被校验的对象
     * @param groups 校验规则分组
     */
    fun <T> validate(obj: T, vararg groups: Class<*>): ValidateResult {
        val arr: Array<Class<*>> = Array(groups.size) { groups[it] }
        val result = ValidateResult()
        val set: Set<ConstraintViolation<T>> = validator.validate(obj, *arr)
        if (set.isNotEmpty()) {
            result.hasErrors = true
            set.forEach {
                result.errorMsg[it.propertyPath.toString()] = it.message
            }
        }
        return result
    }

    /**
     * 使用默认的组策略，对一组属性进行校验
     * @param obj 需要被校验的对象
     * @param propertyNames 需要被校验的属性
     */
    fun <T> validate(obj: T, vararg propertyNames: String): ValidateResult {
        val result = ValidateResult()
        propertyNames.forEach { propertyName ->
            val set: Set<ConstraintViolation<T>> = validator.validateProperty(obj, propertyName, Default::class.java)
            if (set.isNotEmpty()) {
                result.hasErrors = true
                set.forEach { result.errorMsg[propertyName] = it.message }
            }
        }
        return result
    }


    /**
     * 使用默认的组策略，对一组属性进行校验
     * @param obj 需要被校验的对象
     * @param groups 校验策略分组
     * @param propertyNames 需要被校验的属性
     */
    fun <T> validate(obj: T, group: Class<*>, vararg propertyNames: String): ValidateResult {
        val result = ValidateResult()
        propertyNames.forEach { propertyName ->
            val set: Set<ConstraintViolation<T>> = validator.validateProperty(obj, propertyName, group)
            if (set.isNotEmpty()) {
                result.hasErrors = true
                set.forEach { result.errorMsg[propertyName] = it.message }
            }
        }
        return result
    }
}

/**
 * 校验结果
 */
data class ValidateResult(var hasErrors: Boolean = false, var errorMsg: MutableMap<String, String> = mutableMapOf())