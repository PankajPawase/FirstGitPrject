package com.UtilsLayer;

import com.BaseLayer.BaseClass;

public class AlertMethods extends BaseClass  {

	public static void clickOkButton()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void clickOnCancelButton()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureTheErrorMessege()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void enterText(String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
}
