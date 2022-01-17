package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_06_Verify_Recruit_CRM_Chrome_Extension_in_Dashboard extends baseclass {
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
	public void ChromeExtension() {
		Log.startTestCase("verify Import candidates Section in Dashboard");
		String actualurl=dashboard.RecruitCRMChromeExtension();
		String Expectedurl = "https://chrome.google.com/webstore/detail/recruit-crm-sourcing-exte/pabamgafdnanldcgdhpfohfdpjjbekom?utm_source=chrome-ntp-icon";
		Assert.assertEquals(actualurl, Expectedurl);
		Log.endTestCase("verified Invite Teammates section in Dashboard");
		
	}
}