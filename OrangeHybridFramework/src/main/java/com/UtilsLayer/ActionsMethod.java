package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsMethod extends BaseClass {

	public static void click(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}

	public static void doubleCLick(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}

	public static void rightclick(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}

	public static void clickAndHold(WebElement src) {
		new Actions(driver).clickAndHold(src).build().perform();
	}

	public static void release(WebElement target) {
		new Actions(driver).release(target).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement target) {
		new Actions(driver).dragAndDrop(src, target).build().perform();
	}

	public static  void enterText(WebElement wb, String text) {
		new Actions(driver).sendKeys(wb, text).build().perform();
	}

	public static void enterCapitalText(WebElement wb, String text) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, text).build().perform();
	}

	public static void goToBottomOfPage() {
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.END).build().perform();
	}

	public static void goToTopOfPage() {
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.HOME).build().perform();
	}
}
