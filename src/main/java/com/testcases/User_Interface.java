package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.Base;

public class User_Interface  extends Base {

	@BeforeMethod
	public void getdrivers() {
		driver = Base.getDriver();
	}

	@Test(priority = 0)
	public void to_Validate_User_Interface() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	
	@Test(priority = 1)
	public void to_Validate_Login() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}
	
	@Test(priority = 2)
	public void to_Validate_Logout() throws InterruptedException, IOException {
		driver.navigate().refresh();
	}

}
