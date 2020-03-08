package com.example.spring.controller.advice.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@RestControllerAdvice
public class GlobalRestExceptionHandler extends ExceptionHandlerExceptionResolver   {
	
	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest pRequest, HandlerMethod pMethod)
	{
		System.out.println("Hello");
		
		RequestMapping lrm= pMethod.getMethodAnnotation(RequestMapping.class);
		
		System.out.println(lrm.produces()[0]);
		
		return null;
		
	}

}
