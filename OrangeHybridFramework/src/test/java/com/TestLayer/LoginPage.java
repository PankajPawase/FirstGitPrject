package com.TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.Screenshot;

public class LoginPage extends BaseClass {
	
	@BeforeClass
	public void setup(){
			BaseClass.initialization();
	}
	
	@Test
	public void titleValidation()
	{
		
		Assert.assertEquals(driver.getTitle().contains("HRM"),true);
		
		
	}
	
	@Test
	public void urlValidation()
	{
		
		Assert.assertEquals(driver.getCurrentUrl().contains("login"), true);
		
	}

	@Test
	public void loginChech()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test
	public void homePageValidatio(){
		
		Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	}
}
