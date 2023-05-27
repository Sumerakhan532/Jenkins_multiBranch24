package com.reporting.pages;

import org.openqa.selenium.support.PageFactory;

import com.reporting.base.TestBase;

public class InteractiveReportingPage extends TestBase{
	
	
	public InteractiveReportingPage() {
		PageFactory.initElements(driver, this);
	   
	}
	
	public void example()
	{
		System.out.println("demo method");
	}

}
