package com.arpit.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Resource(name = "keys")
	private Map<String, String> keys;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String showHelloWorld() {
		return "Hello world";
	}
}
