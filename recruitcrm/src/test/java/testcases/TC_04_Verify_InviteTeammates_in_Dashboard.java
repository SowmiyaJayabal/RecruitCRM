package testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_04_Verify_InviteTeammates_in_Dashboard extends baseclass {
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
	public void InviteTeammates() {
		Log.startTestCase("verify Invite Teammates Section in Dashboard");
		String message=dashboard.Inviteteammates();
		if (message=="1 Invitation's sent Successfully") {
			System.out.println("Invitatiion sent Successfully");
		}
		Log.endTestCase("verified Invite Teammates section in Dashboard");
		
	}

}