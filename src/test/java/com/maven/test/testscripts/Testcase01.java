package com.maven.test.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.maven.test.Helper.Basepage;
import com.maven.test.pages.Login;

public class Testcase01 extends Basepage {

	@Test
	public void Logintest()
//adding code
	{
		// test = rep.startTest("Logintest");
		// test.log(LogStatus.INFO , "loginwith userid and password");
		try {
			Login lg = PageFactory.initElements(Basepage.driver, Login.class);
			lg.textboxusername().sendKeys("rajasekhar.kakumanu");
			lg.textboxpassword().sendKeys("Aws2018*");
			lg.buttonlogin().click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String text = Basepage.driver.getTitle();
		System.out.println(text);
		if (text.contains("Trinet - Home"))
		// test.log(LogStatus.INFO, "validating the page title");
		{
			// test.log(LogStatus.FAIL, "title not matched");
			// Assert.fail("Checking screen shot scenario");
			System.out.println("Login is success");
		} else {
			System.out.println("Login is Fail");
		}
		// Assert.fail("Login is unsucessful");
	}

	@AfterMethod
	public void quit() {
		// rep.endTest(test);
		// rep.flush();
	}
}
