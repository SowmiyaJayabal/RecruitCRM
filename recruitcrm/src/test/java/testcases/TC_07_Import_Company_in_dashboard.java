package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobjects.dashboardpage;
import utility.Log;

public class TC_07_Import_Company_in_dashboard extends baseclass {
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
	public void ImportCompany() {
		Log.startTestCase("verify Import company Section in Dashboard");
		String message=dashboard.ImportCompanies();
		if (message=="File attached and ready to be used") {
			System.out.println("File attached and ready to be used");
		}
		Log.endTestCase("verified Import company section in Dashboard");
		
}
}