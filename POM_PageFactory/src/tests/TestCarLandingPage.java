package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.carwale.pages.LandingPage;

public class TestCarLandingPage {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.carwale.com");
		LandingPage lp=PageFactory.initElements(driver, LandingPage.class);
		lp.getCarsByBrand("BMW", "M5");
		lp.menu.goToUsedCar();
	}

}
