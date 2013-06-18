package com.selenium.carwale.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(xpath="//*[@id='primary-navbar']/ul/li[4]/a")
	public WebElement newCar;
	@FindBy(xpath="//*[@id='primary-navbar']/ul/li[6]/a")
	public WebElement usedCar;

	
	
	public void goToNewCar(){
		newCar.click();
		
	}
	public void goToUsedCar(){
		usedCar.click();
	}
}