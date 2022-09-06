package org.greens.tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANISH\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Upcasting
		//To launch url
		driver.get("https://www.eclipse.org/downloads/packages/release/oxygen/3a");
		driver.navigate().to("http://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
