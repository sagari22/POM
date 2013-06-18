package com.qtpselenium.facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {

	
	@FindBy(id="userNavigationLabel")
	public WebElement navigationlabel;
	
	@FindBy(xpath="//*[@id='userNavigation']/li[2]/a")
	public WebElement accountSettings;
	
	WebDriver driver;
	
	public TopMenu(WebDriver dr){
		driver=dr;
	}
	
	public AccountSettings gotoAccountSettings(){
		navigationlabel.click();
		accountSettings.click();
		return PageFactory.initElements(driver, AccountSettings.class);
		
	}
	
	public void logout(){
		
	}
}
