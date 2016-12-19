package com.justravel.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class HomePageUI extends BasePageUI{

	public static final CommonUIBean HOME_TAB = new CommonUIBean(GetElementWay.NAME, "首页", "HOME TAB");
	public static final CommonUIBean ROB_TAB = new CommonUIBean(GetElementWay.NAME, "ROB", "rob TAB");
	public static final CommonUIBean UC_TAB = new CommonUIBean(GetElementWay.NAME, "我的", "UC TAB");
	public static final CommonUIBean SEARCH = new CommonUIBean(GetElementWay.ID, "com.justravel.flight:id/btn_search", "首页搜索按钮");

}
