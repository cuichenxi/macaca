package com.justravel.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class FlightListPageUI extends BasePageUI {

	public static final CommonUIBean LIST_VIEW = new CommonUIBean(GetElementWay.ID, "com.justravel.flight:id/pub_pat_ll_bottom_area",
			GetElementWay.CLASS_NAME, "Table", "list view");
	public static final CommonUIBean CELL = new CommonUIBean(GetElementWay.ID, "com.justravel.flight:id/flight_way_list_item_go_info",
			GetElementWay.CLASS_NAME, "Cell", "CELL");

}
