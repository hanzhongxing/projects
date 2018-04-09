package com.test.project.exception;

/**
 * Created by hanzhongxing on 2018/4/9.
 */
public class DaoException extends Exception {
    public static Integer code=0;
    public static String message;
    public static Throwable cause;

    public DaoException(Integer code,String message,Throwable cause){
        this.code=code;
        this.message=message;
        this.cause=cause;
    }

    public DaoException(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public DaoException(Integer code){
        this.code=code;
    }
    public DaoException(String message){
        this.message=message;
    }

    public DaoException(){
        super();
    }
}
