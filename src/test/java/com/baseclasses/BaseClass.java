package com.baseclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver d;

	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gopi\\Desktop\\Gobi042\\Cucumber\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	public void fill(WebElement e, String s) {
		e.sendKeys(s);
	}

	public void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public void click(WebElement e) {
		e.click();

	}

	public void finish() {
		d.quit();
	}
}
