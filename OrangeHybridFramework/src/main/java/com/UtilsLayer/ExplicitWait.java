package com.UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class ExplicitWait extends BaseClass  {

	public static void explicitWait(int Wait,By by)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Wait));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
