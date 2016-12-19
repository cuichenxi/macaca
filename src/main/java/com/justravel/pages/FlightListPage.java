package com.justravel.pages;

import com.justravel.pageuis.FlightListPageUI;

import macaca.java.biz.BasePage;

public class FlightListPage extends BasePage {

	public FlightListPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 点击指定的cell
	 * 
	 * @param index
	 *            要点击的cell的index,限可视区域
	 */
	public void onclickOneCell(int index) throws Exception {
		driver.onclickBeanAtIndex(FlightListPageUI.CELL, index);
	}

}
