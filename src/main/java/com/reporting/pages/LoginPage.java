package com.reporting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reporting.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory or OR
	@FindBy(name="subscriberId")
	WebElement subscriberId;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='image']")
	WebElement loginBtn;
	
	@FindBy(id="topLogoSpacerGif")
	WebElement sirconLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public Boolean validateSirconLogo() {
		return sirconLogo.isDisplayed();	
	}
	
	public HomePage login(String sid, String un, String pwd) {
		subscriberId.sendKeys(sid);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	
		return new HomePage();  //Creating object of home page as login page will return the landing page of homepage as an object
	}

}
