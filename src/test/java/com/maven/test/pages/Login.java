package com.maven.test.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
// updated
public class Login {

	
	@FindBy(xpath="//input[@id='_58_login']")
	private WebElement username;
	public WebElement textboxusername()
	{
		return username;
	}
	
	@FindBy(xpath="//input[@id='_58_password']")
	private WebElement password;
	public WebElement textboxpassword()
	{
		return password;
	}
	
	@FindBy(xpath="//button[@class='btn  btn-primary']")
	private WebElement loginbutton;
	public WebElement buttonlogin()
	{
		return loginbutton;
	}
}
