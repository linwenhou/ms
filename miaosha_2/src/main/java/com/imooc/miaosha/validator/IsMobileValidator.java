package com.imooc.miaosha.validator;

import com.imooc.miaosha.util.ValidatorUtil;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author venvo
 * @date 2020-05-31 21:57
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    @Override
    public void initialize(IsMobile isMobile) {

        required = isMobile.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (required) {
            return ValidatorUtil.isMobile(s);

        } else {
            if (StringUtils.isEmpty(s)) {
                return true;
            } else {
                return ValidatorUtil.isMobile(s);
            }
        }
    }
}
