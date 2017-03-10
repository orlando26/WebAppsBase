package com.jsftemplate.bean;

import com.jsftemplate.db.AppUser;
import com.jsftemplate.model.AppUserModel;
import com.jsftemplate.utils.SHAHash;
import com.jsftemplate.utils.SessionUtils;

public class Login extends Form{

	/**
	 * login Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;
	
	public void logIn(){
		AppUser user = AppUserModel.findByUserName(userName);
		if(validateUser(user)){
			SessionUtils.setUserLogged(user);
			redirect("/pages/home.xhtml");
		}
		
	}
	
	public boolean validateUser(AppUser user){
		String hashedPassword = SHAHash.hash(password);
		if(user.getPassword().equals(hashedPassword)){
			return true;
		}
		return false;
	}
	
	public void regPage(){
		System.out.println("Register");
		redirect("/pages/register.xhtml");
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
