package com.bharat.bharatspringinterceptor;

import java.util.Calendar;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Handler extends HandlerInterceptorAdapter {
	
	
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	        System.out.println("Pre-handle method is called.");
	        Calendar cal= Calendar.getInstance();
	        int dayofweek=cal.get(cal.DAY_OF_WEEK);
	        if(dayofweek==1)
	        {
	        	response.getWriter().write("This website is close on sunday try another day");
	        	return false;
	        }
	        return true;
	    }
	 
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	        System.out.println("Post-handle method is called.");
	    }
	 
	    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	        System.out.println("After completion method is called.");
	    }
	

}
