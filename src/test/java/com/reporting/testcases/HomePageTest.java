package com.reporting.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reporting.base.TestBase;
import com.reporting.pages.FirmInformationInquiryPage;
import com.reporting.pages.HomePage;
import com.reporting.pages.InteractiveReportingPage;
import com.reporting.pages.LoginPage;
import com.reporting.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InteractiveReportingPage interactiveReportingPage;
	FirmInformationInquiryPage firmInformationInquiryPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		//interactiveReportingPage = new InteractiveReportingPage();
		firmInformationInquiryPage = new FirmInformationInquiryPage();
		homePage = loginPage.login(prop.getProperty("subscriberid"), prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String title=homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "Home - Sircon Producer Manager");
	}
	
	@Test(priority=3)
	public void verifyInteractiveReportingPageTest() throws InterruptedException {
		homePage.verifyInquiriesTab();
		interactiveReportingPage = homePage.verifyInteractiveReportingPage();
		testUtil.sleepThread();
		Thread.sleep(30000);
	}
	
	@Test(priority=2)
	public void verifyFirmInformationInquiryPageTest() throws InterruptedException {
		homePage.verifyInquiriesTab();
		firmInformationInquiryPage = homePage.verifyFirmInformationInquiry();
		testUtil.sleepThread();
	}
	
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
	

}
