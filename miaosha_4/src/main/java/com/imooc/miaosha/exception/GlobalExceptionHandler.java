package com.imooc.miaosha.exception;

import com.imooc.miaosha.result.CodeMsg;
import com.imooc.miaosha.result.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @author linwenhou
 * @date 2020-05-31 22:04
 * @description
 * @modified By
 * @version: jdk1.8
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandler(HttpServletRequest request, Exception e) {

        if (e instanceof GlobalException) {
            e.printStackTrace();
            GlobalException ex = (GlobalException) e;
            return Result.error(ex.getCm());

        } else if (e instanceof BindException) {
            e.printStackTrace();
            BindException exception = (BindException) e;
            List<ObjectError> allErrors = exception.getAllErrors();
            ObjectError error = allErrors.get(0);
            String msg = error.getDefaultMessage();

            return Result.error(CodeMsg.BIND_ERROR.fillArgs(msg));
        } else {
            e.printStackTrace();
            return Result.error(CodeMsg.SERVER_ERROR);
        }

    }
}
