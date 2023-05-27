package com.reporting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reporting.base.TestBase;

public class HomePage extends TestBase{
	//Page Factory or OR
	//@FindBy(id="userInforName")
	//WebElement userInfo;
	
	@FindBy(xpath="//*[@id='userInfo']/span/span")
	WebElement userInfo;
	
	
	@FindBy(xpath="//*[@id='mainMenu']/li[1]/a/span")
	WebElement licensingTab;
	
	@FindBy(xpath="//*[@id='mainMenu']/li[2]/a/span")
	WebElement companiesTab;
	
	@FindBy(xpath="//*[@id='mainMenu']/li[3]/a/span")
	WebElement inquiriesTab;
	
	@FindBy(xpath="//*[@id='mainMenu']/li[4]/a/span")
	WebElement servicesTab;
	
	@FindBy(xpath="//*[@id='mainMenu']/li[5]/a/span")
	WebElement administrationTab;
	
	@FindBy(xpath="//*[@id='ui-id-75\']")
	WebElement interactiveReportingLink;
	
	@FindBy(id="ui-id-76")
	WebElement informationSection;
	
	@FindBy(id="ui-id-85")
	WebElement subsectionFirmInformationInquiry;
	
	//Initializing the page Objects - create the constructor of the homepage
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean verifyCorrectUserName() {
		return userInfo.isDisplayed();
		
	}
	
	public void verifyLicensingTab() {
		licensingTab.click();
	}
	
	
	public void verifyCompaniesTab() {
		companiesTab.click();
	}
		
	public void verifyInquiriesTab() {
		inquiriesTab.click();
	}	
		
		
	public void verifyservicesTab() {
		servicesTab.click();
	}
		
	public void verifyadministrationTab() {
		administrationTab.click();
	}	
	
	public InteractiveReportingPage verifyInteractiveReportingPage() {
		interactiveReportingLink.click();
		return new InteractiveReportingPage();
	
	}
	
	public FirmInformationInquiryPage verifyFirmInformationInquiry() {
		Actions a = new Actions(driver);
		a.moveToElement(informationSection).build().perform();
		subsectionFirmInformationInquiry.click();
		return new FirmInformationInquiryPage();
		
	}
	     // or
	      
  // public void verifyFirmInformationInquiry() {
	//   verifyInquiriesTab();
	  // Actions a = new Actions(driver);
	   //a.moveToElement(informationSection)
	   //Thread.sleep(3000);
	   //subsectionFirmInformationInquiry.click();
	  	//}
	      
	      
	
}
//*[@id="mainMenu"]/li[1]/a/span
//*[@id='mainMenu']/li[3]/ul/li[2]/a //*[@id="ui-id-75"]