package com.zwf.boot1.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 标记这个是一个异常处理类
 */
//@RestControllerAdvice
@ControllerAdvice
public class CustomExtHandler {


//
//    @ExceptionHandler(value = Exception.class)
//    JsonData handlerException(Exception e, HttpServletRequest request){
//
//        return JsonData.buildError("服务端出问题了", -2);
//    }



    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request){


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        System.out.println(e.getMessage());
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;


    }



}
