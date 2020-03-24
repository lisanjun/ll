package com.briup.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api()
public class TestController {
	
	
	//@RequestMapping(value="/test",method=RequestMethod.GET)
	@GetMapping("/test")
	@ApiOperation("sss")
	public String test() {
		return "hello";
	}
}
