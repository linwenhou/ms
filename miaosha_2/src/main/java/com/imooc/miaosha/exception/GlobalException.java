package com.imooc.miaosha.exception;

import com.imooc.miaosha.result.CodeMsg;

/**
 * @author venvo
 * @date 2020-05-31 22:14
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public CodeMsg getCm() {
        return cm;
    }

    public void setCm(CodeMsg cm) {
        this.cm = cm;
    }
}
