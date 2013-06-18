package com.qtpselenium.facebookpages;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;

public class PersonalProfile {
	WebDriver driver;
	 public PersonalProfile(WebDriver dr){
		 driver=dr;
		// 1. verify if page is valid
			if (driver.getTitle() != "Find a Flight: Mercury Tours:")
	            throw new NoSuchWindowException("This is not the FindFlights page");
	 }
	
	@FindBy(linkText=Constants.friendsLink)
	public WebElement friendsList;
	
	@FindBy(xpath="//*[@id='fbProfilePicSelector']/div/a/span")
	public WebElement editProfile;
	
	@FindBy(xpath="//*[@class='fbTimelineSelectorFileInput']")
	public WebElement uploadPhoto;
	
	public friendList loadFriendList(){
		friendsList.click();
		return PageFactory.initElements(driver, friendList.class);
	}
	
	public void changeProfilePic(String newpicPath){
		editProfile.click();
		uploadPhoto.click();
		
	}

}
