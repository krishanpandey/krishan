package com.qtpselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	protected WebDriver driver;
	@Test
	public void guru99() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Krishan\\Study\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String eTitle = "Meet Guru99";
	String aTitle = "";
	driver.get("http://www.guru99.com");
	driver.manage().window().maximize();
	aTitle = driver.getTitle();
	if(aTitle.contentEquals(eTitle)){
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	driver.close();
	
	}

}
