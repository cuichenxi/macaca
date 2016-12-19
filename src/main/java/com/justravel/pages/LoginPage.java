package com.justravel.pages;

import com.justravel.pageuis.LoginPageUI;

import macaca.java.biz.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	// 登录操作
	public void login(String username ,String password){
		driver.inputBean(LoginPageUI.USER_NAME, username);
		driver.inputBean(LoginPageUI.PASSWORD, password);
		driver.onclickBean(LoginPageUI.LOGIN_BTN);
	}
}
