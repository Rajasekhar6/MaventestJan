package com.maven.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maven.test.Helper.Basepage;



public class LandingPage extends Basepage{

	@FindBy(xpath="//a[@href='https://trinet.trianz.com/group/guest/my-practice']")
	private WebElement practicesmenu;
	public WebElement labelpracticename()
	{
		return practicesmenu;
	}
	
    @FindBy(xpath="//a[text()='Verification & Validation']")
//@FindBy(xpath="//li//a[text()='Verification & Validation']")
	private WebElement validationmenu;
	public WebElement labelvalidatemenu()
	{
		return validationmenu;
	}
	
	@FindBy(xpath="//span[text()='Document Library']")
	private WebElement documentbutton;
	
	public WebElement buttondocument()
	{
		return documentbutton;
	}
	
}
