package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.Base;

public class Admin_Interface  extends Base {

	@BeforeMethod
	public void getdrivers() {
		driver = Base.getDriver();
	}

	@Test(priority = 0)
	public void to_Validate_Admin_Interface() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}

	@Test(priority = 0)
	public void to_Validate_Admin_Interface_UserDetails() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	
	@Test(priority = 0)
	public void to_Validate_Admin_Interface_SalesDetails() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
}
