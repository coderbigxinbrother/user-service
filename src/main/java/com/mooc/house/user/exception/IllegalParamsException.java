package com.mooc.house.user.exception;

public class IllegalParamsException extends RuntimeException implements WithTypeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Type type;
	
	public IllegalParamsException(){
		
	}
	
	public IllegalParamsException(Type type,String msg){
		super(msg);
		this.type = type;
	}
	
	public Type type(){
		return type;
	}
	
	public enum Type{
		WRONG_PAGE_NUM,LACK_PARAMTER,USER_NOT_LOGIN,USER_NOT_FOUND,USER_AUTH_FAIL;
	}
}
