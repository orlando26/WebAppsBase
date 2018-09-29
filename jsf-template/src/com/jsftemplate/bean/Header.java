package com.jsftemplate.bean;

public class Header extends Form{

	/**
	 * Header bean
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean session;
	
	public void logOut(){
		
	}

	public boolean getSession() {
		session = false;
		return session;
	}

	public void setSession(boolean session) {
		this.session = session;
	}

}
