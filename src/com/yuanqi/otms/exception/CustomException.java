package com.yuanqi.otms.exception;

/**
 * 
* @Title: CustomException.java 
* @Package com.yuanqi.otms.exception 
* @Description: TODO系统自定义的异常类型，实际开发中可能要定义多种异常类型 
* @author 元启智能   李晓刚
* @date 2015年7月14日 下午4:02:31 
* @version V1.0
 */
public class CustomException extends Exception {
	
	//异常信息
	private String message;
	
	public CustomException(String message){
		super(message);
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
