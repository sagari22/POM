package com.qtpselenium.facebookpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSettings {

	@FindBy(xpath="//*[@id='SettingsPage_Content']/ul/li[4]/a/span[1]")
	public WebElement editButton;
	
	@FindBy(id="password_old")
	public WebElement oldPass;
	
	@FindBy(id="password_new")
	public WebElement newPass;
	
	@FindBy(id="password_confirm")
	public WebElement confirmPass;
	
	@FindBy(xpath="//input[value='Save Changes']")
	public WebElement saveButton;
	
	
	
	public void changePassword(String oldPassword, String newPassword){
		editButton.click();
		oldPass.sendKeys(oldPassword);
		newPass.sendKeys(newPassword);
		confirmPass.sendKeys(newPassword);
		
	}
	
}
