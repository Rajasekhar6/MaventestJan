package com.maven.test.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.test.Helper.Basepage;
import com.maven.test.pages.*;


public class Testcase02 {

	@Test
	public void LandingPage() throws InterruptedException {

		try {

			LandingPage lgg = PageFactory.initElements(Basepage.driver, LandingPage.class);

			Actions act = new Actions(Basepage.driver);
			act.moveToElement(lgg.labelpracticename()).build().perform();
			// lgg.labelpracticename().click();

			Thread.sleep(6000);

			lgg.labelvalidatemenu().click();

			Thread.sleep(6000);

			String actualvalue = Basepage.driver.findElement(By.xpath("//h1[text()='Verification & Validation']"))
					.getText();
			System.out.println("Landing page title" + actualvalue);
		//	test.log(LogStatus.INFO, "Checking the Landing page title");
			Assert.assertEquals("Verification & Validation", actualvalue);
			// lgg.buttondocument().click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
