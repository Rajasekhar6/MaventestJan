package com.maven.test.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.test.Helper.Basepage;
import com.maven.test.pages.Login;


public class Testcase01 extends Basepage{

@Test
public void Logintest()

{
	try {
	Login lg = PageFactory.initElements(Basepage.driver,Login.class);
	lg.textboxusername().sendKeys("rajasekhar.kakumanu");
	lg.textboxpassword().sendKeys("Kushal2018*");
	lg.buttonlogin().click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
String text = Basepage.driver.getTitle();
System.out.println(text);
if(text.contains("Trinet - Home"))
	System.out.println("Login is success");
else
System.out.println("Login is Fail");
}
}
