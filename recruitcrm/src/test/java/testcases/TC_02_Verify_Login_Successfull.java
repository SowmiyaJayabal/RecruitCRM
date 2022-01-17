package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.Loginpage;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_02_Verify_Login_Successfull extends baseclass{
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
	public void  logintest(String uname, String pswd) throws Throwable {
		Log.startTestCase("loginTest");
		dashboardpage dashboard= new dashboardpage();
		Log.info("Enter Username and Password");
		dashboard=login.login(uname,pswd);
	    String actualURL=dashboard.getCurrURL();
	    String expectedURL="httL://automationpractice.com/index.php?controller=my-account";
	    Log.info("Verifying if user is able to login");
	    Assert.assertEquals(actualURL, expectedURL);
	    Log.info("Login is Sucess");
	    Log.endTestCase("loginTest");
		
		
	}
}