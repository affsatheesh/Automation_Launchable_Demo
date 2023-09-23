package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.Base;

public class Dashboard extends Base {

	@BeforeMethod
	public void getdrivers() {
		driver = Base.getDriver();
	}

	@Test(priority = 0)
	public void to_Validate_Dashboard() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	

	@Test(priority = 0)
	public void to_Validate_Dashboard_UserCount() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}

}
