package com.briup.demo.utils;

/**
 * 自定义异常
 * @author 三
 * 
 * 
 * */

public class CustomerException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	public CustomerException(Integer code,String message) {
		
	}
	
	
	

}
