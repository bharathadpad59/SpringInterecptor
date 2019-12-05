package com.bharat.bharatspringinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/Authentication")
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response)
	{
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("Result",a);
		mv.addObject("Result1", b);
		mv.setViewName("index.jsp");
		//System.out.println("Handler method is called");
		return mv;
	}

}
