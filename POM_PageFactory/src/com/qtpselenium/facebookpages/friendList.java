package com.qtpselenium.facebookpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qtpselenium.util.Constants;


public class friendList {
	WebDriver driver;
	public friendList(WebDriver dr){
		driver =dr;
	}
	
	@FindBy(xpath=Constants.searchbox)
	public WebElement searchbox;
	
	public boolean findAfriend(String friendname){
		searchbox.sendKeys(friendname);
		int friends=driver.findElements(By.linkText(friendname)).size();
		System.out.println(friends);
		if(friends==0)
			return false;
		else 
			return true;
	}

}
