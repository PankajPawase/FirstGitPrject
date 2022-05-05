package com.UtilsLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class FrameMethods extends BaseClass {

	public static void switchTOTopFrame() {
		driver.switchTo().defaultContent();
	}

	public static void switchToChildFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToChildFrameByName(String name) {
		driver.switchTo().frame(name);
	}

	public static void switchToChildFrameByWebElement(WebElement wb) {
		driver.switchTo().frame(wb);
	}

	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
}
