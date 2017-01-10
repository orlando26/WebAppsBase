package com.jsftemplate.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsftemplate.bean.Login;

@ManagedBean
@SessionScoped
public class SessionContext implements Serializable{

	/**
	 * SessionContext Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private Login login;

	public Login getLogin() {
		if (login == null){
			login = new Login();
		}
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	

}
