package com.justravel.cases;

import org.junit.Test;

import com.justravel.pages.FlightListPage;
import com.justravel.pages.FlightOtaPage;
import com.justravel.pages.HomePage;
import com.justravel.pageuis.FlightListPageUI;
import com.justravel.pageuis.FlightOtaPageUI;
import com.justravel.pageuis.HomePageUI;

import macaca.java.biz.ResultGenerator;

public class SampleTest extends BaseTest {

	@Test
	public void test() throws Exception {

		// 测试首页
		HomePage homePage = new HomePage("首页");
		homePage.setDriver(driver);
		if (homePage.hasPageShown(HomePageUI.HOME_TAB)) {
			saveScreen(homePage.pageDesc);
			ResultGenerator.loadPageSucc(homePage);
			// 进入列表
			homePage.goToSearch();
		} else {
			// 首页没有加载成功，后面的用例都不用执行了，return
			ResultGenerator.loadPageFail(homePage);
			return;
		}

		// 机票列表页
		FlightListPage flightListPage = new FlightListPage("机票列表");
		flightListPage.setDriver(driver);
		if (flightListPage.hasPageShown(FlightListPageUI.LIST_VIEW)) {
			saveScreen(flightListPage.pageDesc);
			ResultGenerator.loadPageSucc(flightListPage);
			// 进入填单页
			flightListPage.onclickOneCell(1);
		} else {
			ResultGenerator.loadPageFail(flightListPage);
			return;
		}
		// OTA列表页
		FlightOtaPage flightOtaPage = new FlightOtaPage("OTA列表");
		flightOtaPage.setDriver(driver);
		if (flightOtaPage.hasPageShown(FlightOtaPageUI.LIST_VIEW)) {
			saveScreen(flightOtaPage.pageDesc);
			ResultGenerator.loadPageSucc(flightOtaPage);
			// 进入填单页
			flightOtaPage.onclickOneCell(0);
		} else {
			ResultGenerator.loadPageFail(flightOtaPage);
			return;
		}
	}
}
