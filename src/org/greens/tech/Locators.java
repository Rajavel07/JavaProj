package org.greens.tech;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators {
	public static void main(String[] args) throws AWTException {
		//configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANISH\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Upcasting
		//To launch url
		driver.get("https://www.facebook.com/");
	    //To maximize window
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("greens@gamil.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
}
}
