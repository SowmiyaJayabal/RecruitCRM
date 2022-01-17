package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.homepage;
import utility.Log;

public class TC_09_Verify_Home_page_Title_Recruit_CRM extends baseclass {
	homepage home;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void verifyTitle() {
		Log.startTestCase("verify Title in home page");
		String title=home.ValidateHomepagetitle();
		if (title==" Recruit CRM") {
			System.out.println("Recruit CRM");
		}
		Log.endTestCase("verified Title in home page");
	}

}

