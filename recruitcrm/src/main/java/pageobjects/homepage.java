package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiondriver.action;
import basepackage.baseclass;

public class homepage extends baseclass{
	
	@FindBy(xpath="//*[@id=\"navbarExampleTransparentExample\"]/div[4]/div[2]")
	WebElement whatsnew;
	
	@FindBy(xpath="//*[@id=\"Path_6289\"]")
	WebElement homepagetitle;
	
	@FindBy(xpath="//*[@id=\"navbarExampleTransparentExample\"]/div[4]/a")
	WebElement upgradeplan;
	
	@FindBy(xpath ="//*[@id=\"newPlansAndBilling\"]/div/div[1]/div/div/ul/li[1]/a")
	WebElement currentplan;
	
	public String whatsNew() {
		
		action.click(driver, whatsnew);
		driver.switchTo().frame("//*[@id=\"beamerNews\"]");
		String header = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a")).getText();
		//What's New in Recruit CRM
		return header;
		
	}
	
	public String ValidateHomepagetitle() {
		
		String title;
		title = driver.findElement(By.xpath("//*[@id=\"Path_6289\"]")).getText();
		return title;
		//Recruit CRM
		
	}
	
	public String checkcurrentplan() {
		
		action.click(driver, upgradeplan);
		action.click(driver,currentplan);
		String plan = driver.findElement(By.xpath("//*[@id=\"CurrentPlanCard\"]/div[1]/div[1]/div[1]/div/div[2]/h2")).getText();
		
		//current plan free
		return plan;
		
	}

}
