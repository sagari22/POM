package com.qtpselenium.facebookpages;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")
	public WebElement profile;
	public LandingPage(WebDriver dr){
		driver=dr;
		// 1. verify if page is valid
		if (driver.getTitle() != "Find a Flight: Mercury Tours:")
            throw new NoSuchWindowException("This is not the FindFlights page");		
		
	}
	
	public PersonalProfile goToProfile(){
		profile.click();
		return PageFactory.initElements(driver, PersonalProfile.class);		
		
	}

}
