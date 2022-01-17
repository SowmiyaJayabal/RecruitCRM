package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_03_Verify_Connect_Email_in_Dashboard_Section extends baseclass {
	dashboardpage dashboard;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void connectemailverify() {
		Log.startTestCase("verify Connect Email Section in Dashboard");
		String url= dashboard.connectEmail();
		String eurl="https://accounts.google.com/";
		Assert.assertEquals(url, eurl);
		Log.endTestCase("verified connect email section in Dashboard");
	}

}
