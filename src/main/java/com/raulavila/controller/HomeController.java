package com.raulavila.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private String message = "Hello World (body)";

	@RequestMapping(value="/helloWorld", produces = "text/html")
	@ResponseBody
	public String helloBody() throws IOException{
		return "<h1>" + message + "</h1>";
	}

	@RequestMapping(value="/helloWorldView")
	public ModelAndView helloView() throws IOException{
		return new ModelAndView("home");
	}
}
