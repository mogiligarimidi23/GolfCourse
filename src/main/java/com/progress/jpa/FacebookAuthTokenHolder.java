package com.progress.jpa;

/**
 * Facebook authtoken stored in this class
 * 
 * @author mgarimid
 * 
 */
public class FacebookAuthTokenHolder {

	private String authToken;

	public FacebookAuthTokenHolder() {
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
