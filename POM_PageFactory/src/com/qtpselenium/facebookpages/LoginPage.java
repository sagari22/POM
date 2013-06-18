package com.qtpselenium.facebookpages;


import org.junit.Assert;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;

public class LoginPage {
	
	public WebDriver driver;
//	Defining username field
	@FindBy(id="email")
	public WebElement username;

//	Defining password field	
	@FindBy(id="pass")
	public WebElement password;

//	Defining Login button
	@FindBy(id="u_0_b")
	public WebElement login;
	
	public LoginPage(WebDriver dr){
		driver=dr;
		// 1. verify if page is valid
		if (driver.getTitle() != "Find a Flight: Mercury Tours:")
            throw new NoSuchWindowException("This is not the FindFlights page");
	}
	
	public LandingPage doLogin(String uname, String pword){
		driver.get("http://www.facebook.com");//config.prop
		//verify title
//		Assert.assertEquals(Constants.titleHomePage, driver.getTitle());
	
		username.sendKeys(uname);
		password.sendKeys(pword);
		login.click();
		//validate login successful
		
		LandingPage landingpage= PageFactory.initElements(driver, LandingPage.class);
//		landingpage.goToProfile();
		return landingpage;
		
		
	}
	
	
}
