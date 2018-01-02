package com.maven.test.testscripts;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.test.Helper.Basepage;
import com.maven.test.pages.*;

public class Testcase02 {

	@Test
	public void LandingPage()

	{
		try {
			LandingPage lgg = PageFactory.initElements(Basepage.driver, LandingPage.class);

		Actions act = new Actions(Basepage.driver);
		act.moveToElement(lgg.labelpracticename()).build().perform();
		//	lgg.labelpracticename().click();

			Thread.sleep(6000);

			//Actions act = new Actions(Basepage.driver);
			//act.moveToElement(lgg.labelvalidatemenu()).build().perform();
			lgg.labelvalidatemenu().click();

			Thread.sleep(6000);

			lgg.buttondocument().click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
