package com.light.shop.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


public class ExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
			if(ex instanceof BizException){
				BizException bizException = (BizException) ex;
				System.out.println(bizException.getCode());
				//returnDto.setMessage(bizException.getMessage());
			}
		return null;
	}

}
