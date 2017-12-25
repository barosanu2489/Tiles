package com.barosanu.model.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserSessionTokens {

	private boolean token1 = true;
	private boolean token2 = false;
	private boolean token3 = true;

	public boolean isToken1() {
		System.out.println("isToken1() " + token1);
		return token1;

	}

	public void setToken1(boolean token1) {
		this.token1 = token1;
		System.out.println(token1);
	}

	public boolean isToken2() {
		return token2;
	}

	public void setToken2(boolean token2) {
		this.token2 = token2;
	}

	public boolean isToken3() {
		return token3;
	}

	public void setToken3(boolean token3) {
		this.token3 = token3;
	}

}
