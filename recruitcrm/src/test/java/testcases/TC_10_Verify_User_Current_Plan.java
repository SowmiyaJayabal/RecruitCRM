package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.homepage;
import utility.Log;

public class TC_10_Verify_User_Current_Plan extends baseclass {
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
	public void checkcurrentplan() {
		Log.startTestCase("verify current plan of the user in home page");
		String plan=home.checkcurrentplan();
		System.out.println("Current Plan of the user is :"+plan);
		Log.endTestCase("verified current plan of the user in home page");
	}

}