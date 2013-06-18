package com.selenium.carwale.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id="drpPQMakes")
	public WebElement brand;
	@FindBy(id="drpPQModels")
	public WebElement model;
	@FindBy(name="price")
	public WebElement price;
	
	public Menu menu = null;
	
	public LandingPage(WebDriver driver){
	if(menu==null){
		menu =PageFactory.initElements(driver, Menu.class);
	}}
	
	public void getCarsByBrand(String mybrand,String mymodel) throws InterruptedException{
		
		brand.sendKeys(mybrand);
		brand.sendKeys(Keys.TAB);
		model.sendKeys(mymodel);
		price.click();
	}
	
	public void getNewPriceQuote(String brand,String model){
		
	}

}
