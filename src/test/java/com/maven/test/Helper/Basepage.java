package com.maven.test.Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Basepage {

		
public static WebDriver driver = null;

	@BeforeClass
	public void startbrowser()
	{
		if(driver==null)
		{
		String brwname = "CH";
	//	String URL = "https://trinet.trianz.com";
		
		if(brwname.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Personel\\Softwares\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(brwname.equalsIgnoreCase("CH"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Personel\\Softwares\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		}
		driver.get("https://trinet.trianz.com");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		}
}