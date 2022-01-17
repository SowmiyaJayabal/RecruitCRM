package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Log;

import basepackage.baseclass;
import pageobjects.Loginpage;

public class TC_01_Verify_title extends baseclass{
	Loginpage login;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void verifytitle() {
		Log.startTestCase("verifyTitle");
		login = new Loginpage();
		String acttitle = login.gettitle();
		String exptitle = "Dashboard | Recruit CRM";
		Assert.assertEquals(acttitle,exptitle);
		Log.endTestCase("verifyTitle");
	}
	
}
