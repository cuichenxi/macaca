package com.justravel.pages;

import com.justravel.pageuis.HomePageUI;

import macaca.java.biz.BasePage;

public class HomePage extends BasePage{

	public HomePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * 点击home tab
	 */
	public void tabHome() {
		driver.onclickBean(HomePageUI.HOME_TAB);
	}

	/**
	 * 进入List页
	 */
	public void goToSearch(){
		driver.onclickBean(HomePageUI.SEARCH);
	}
	
}
