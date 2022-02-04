package com.wm.controller.uitls;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/31-19:20
 */

//作為springmvc的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //不指定时默认拦截所有类型的异常，指定后只拦截指定异常
    @ExceptionHandler(Exception.class)
    public R doExceptions(Exception ex){

        ex.printStackTrace();
        return new R(false,ex.getClass());
    }
}
