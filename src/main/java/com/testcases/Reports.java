package com.testcases;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.Base;

public class Reports extends Base {

	@BeforeMethod
	public void getdrivers() {
		driver = Base.getDriver();
	}

	@Test(priority = 0)
	public void to_Validate_Reports() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	
	@Test(priority = 1)
	public void to_Validate_User_Reports() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	
	@Test(priority = 2)
	public void to_Validate_Sales_Reports() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
}
