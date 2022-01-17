package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;

import pageobjects.homepage;
import utility.Log;

public class TC_08_Verify_Whats_New_Button_in_HomePage extends baseclass {
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
		public void whatsNewButton() {
			Log.startTestCase("verify What's New Button in home page");
			String message=home.whatsNew();
			if (message=="What's New in Recruit CRM") {
				System.out.println("What's New in Recruit CRM");
			}
			Log.endTestCase("verified What's New Button in home page");
		}

}
