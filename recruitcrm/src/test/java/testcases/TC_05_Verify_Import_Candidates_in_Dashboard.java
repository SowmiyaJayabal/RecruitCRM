package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_05_Verify_Import_Candidates_in_Dashboard extends baseclass {
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
		Log.startTestCase("verify Import candidates Section in Dashboard");
		String message=dashboard.ImportCandidates();
		if (message=="File attached and ready to be used") {
			System.out.println("File attached and ready to be used");
		}
		Log.endTestCase("verified Import candidates section in Dashboard");
		
	}

}