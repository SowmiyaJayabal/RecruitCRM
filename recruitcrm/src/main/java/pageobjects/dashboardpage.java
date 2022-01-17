package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiondriver.action;
import basepackage.baseclass;

/**
 * @author sowmiyaJayabal
 *
 */

public class dashboardpage extends baseclass {

	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[1]/div/div[1]/ul/li[1]/a/div/div[2]")
	WebElement importCandidates;
	
	@FindBy(xpath="/html/body/div[86]/div[2]/div/section/div/div[2]/div/div/div/label/div/a")
	WebElement uploadfileButton;
	@FindBy(xpath="/html/body/div[85]/button")
	WebElement CancelButton;
	
	@FindBy(xpath ="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[1]/div/div[1]/ul/li[2]/a/div/div[2]/div/p")
	WebElement connectEmailAccount;
	
	@FindBy(xpath="//*[@id=\"sTest-connectGmailBtn\"]")
	WebElement connect;
	
	@FindBy(xpath="//*[@id=\"login_hint\"]")
	WebElement connectemail;
	
	@FindBy(xpath="//*[@id=\"footer\"]/input")
	WebElement connectsignin;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[1]/div/div[1]/ul/li[3]/a/div/div[2]/div/p")
	WebElement Inviteteammates;
	
	@FindBy(xpath ="/html/body/div[86]/div[2]/form/div/section/div[3]/div/div/div[2]/div/div[1]/a")
	WebElement dropdownrole;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/a/div/div[2]/div/p")
	WebElement ChromeExtension;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/ul/li[1]/a/div")
	WebElement Importcompany;
	
	@FindBy(xpath="/html/body/div[17]/button")
	WebElement Importcompanycancelbutton;
	
	//@FindBy(xpath="")
	//WebElement
	
	
	
	public String connectEmail() {
		action.click(driver, connectEmailAccount);
		driver.navigate().to("https://app.recruitcrm.io/user/sync_email");
		action.click(driver, connect);
		action.type(connectemail, "abc@gmail.com");
		action.click(driver, connectsignin);
		String url= driver.getCurrentUrl();
		return url;
		
	}
	public String Inviteteammates() {
		action.click(driver, Inviteteammates);
		driver.switchTo().frame("modal-card-head");
		driver.findElement(By.xpath("/html/body/div[86]/div[2]/form/div/section/div[3]/div/div/div[1]/div/div/input")).sendKeys("abc@gmail.com");
	    action.selectByVisibleText("Admin",dropdownrole);
	    driver.findElement(By.xpath("/html/body/div[86]/div[2]/form/div/footer")).click();
	    driver.findElement(By.xpath("/html/body/div[86]/div[2]/form/div/footer/a")).click();
	    Alert promptAlert  = driver.switchTo().alert();
	    String alertText = promptAlert.getText();
	    return alertText;
		
	}
	public String getCurrURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String ImportCandidates() {
		action.click(driver, importCandidates);
		driver.switchTo().frame("intercom-frame");
		driver.findElement(By.xpath("/html/body/div[86]/div[2]/div/section/div/div[2]/div/div/div/label/div/a")).sendKeys("C:\\Users\\SowmiyaJayabal\\Documents\\1.xls");
		
		 Alert promptAlert  = driver.switchTo().alert();
		 String Messagepopup = promptAlert.getText();
		//File attached and ready to be used
		return Messagepopup;
	}
	
	public String RecruitCRMChromeExtension() {
		
		driver.findElement(By.id("sTest-dashboradIcon")).click();
		action.click(driver,ChromeExtension);
		String chromeurl = driver.getCurrentUrl();
		return chromeurl;
		
	}
	
	public String ImportCompanies() {
		{
			action.click(driver, Importcompany);
			driver.switchTo().frame("intercom-frame");
			driver.findElement(By.xpath("/html/body/div[85]/div[2]/div/section/div/div[2]")).sendKeys("C:\\Users\\SowmiyaJayabal\\Documents\\1.xls");
			
			 Alert promptAlert  = driver.switchTo().alert();
			 String Messagepopup = promptAlert.getText();
			//File attached and ready to be used
			return Messagepopup;
		}
	}
}
