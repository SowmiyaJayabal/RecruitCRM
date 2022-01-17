package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.action;
import basepackage.baseclass;

public class Loginpage extends baseclass{
	@FindBy(id="sTestEmail")
	WebElement Email;
	
	@FindBy(id="sTestPassword")
	WebElement Password;
	
	@FindBy(id="sTestLoginBtn")
	WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"application\"]/div/div/main/div/div/div[2]/section/div/div/p/a")
	WebElement SignUpLink;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public dashboardpage login(String uname, String pswd) {
		action.type(Email, uname);
		action.type(Password, pswd);
		action.click(driver, Submit);
		return new dashboardpage();
	
	}
	
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public signuppage signup() {
		action.click(driver,SignUpLink);
		return new signuppage();
	}

}
