package com.justravel.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

public class FlightOtaPageUI extends BasePageUI {

	public static final CommonUIBean LIST_VIEW = new CommonUIBean(GetElementWay.ID, "com.justravel.flight:id/ll_content",
			GetElementWay.CLASS_NAME, "Table", "list view");
	public static final CommonUIBean CELL = new CommonUIBean(GetElementWay.ID, "com.justravel.flight:id/ota_list_lift_view",
			GetElementWay.CLASS_NAME, "Cell", "CELL");

}
