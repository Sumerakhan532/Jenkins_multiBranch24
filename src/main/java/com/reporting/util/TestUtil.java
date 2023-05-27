package com.reporting.util;

import com.reporting.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WATI =10;
	
	public void sleepThread() throws InterruptedException {
		Thread.sleep(PAGE_LOAD_TIMEOUT);
	}
	
	
	
	public void switchToFrame() {
		driver.switchTo().frame("");
		
	}

}
