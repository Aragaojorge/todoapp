package com.devjola.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		
		return "Hello! What are you learning today?";
		
	}
	
	// Using a view
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		
		return "sayHello";
		
	}
	
}
