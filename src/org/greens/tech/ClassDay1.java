package org.greens.tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassDay1 {
	public static void main(String[] args) {
		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANISH\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MANISH\\eclipse-workspace\\SeleniumClass\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MANISH\\eclipse-workspace\\SeleniumClass\\Driver\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver ();//Upcasting
		WebDriver gecko = new FirefoxDriver ();//Upcasting
		WebDriver ie = new InternetExplorerDriver();//Upcasting
		
		//To launch url
		driver.get("https://www.facebook.com/");
		//To launch url1
		gecko.get("https://www.amazon.in");
		//To launch url2
		ie.get("http://www.greenstechnologys.com/");
		
		//To get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//To get current url1
		String url1 = gecko.getCurrentUrl();
		System.out.println(url1);
		
		//To get current url2
		String url2 = ie.getCurrentUrl();
		System.out.println(url2);
		
		//To get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To get title1
		String title1 = gecko.getTitle();
		System.out.println(title1);
		
	}
}
