package com.jsftemplate.bean;

import com.jsftemplate.model.AppUserModel;

public class Login extends Form{

	/**
	 * login Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;
	
	public void logIn(){
		if( password.equals(AppUserModel.findByUserName(userName).getPassword())){
			System.out.println("Log in");
		}
	}
	
	
	/* Getters & Setters */
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
