package kotun.common.validation

/**
 * 可被校验的bean的接口
 */

interface Validatable {
    /**
     * @see Validator#validate(Any,Class<*)
     */
    fun validate(): ValidateResult {
        return Validator.validate(this)
    }

    fun validate(vararg groups: Class<*>): ValidateResult {
        return Validator.validate(this, *groups)
    }

    fun validateProperty(vararg propertyNames: String): ValidateResult {
        return Validator.validate(this, *propertyNames)
    }

    fun validateProperty(group: Class<*>, vararg propertyNames: String): ValidateResult {
        return Validator.validate(this, group, *propertyNames)
    }
}