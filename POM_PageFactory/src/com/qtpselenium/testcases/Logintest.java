package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;

import com.qtpselenium.facebookpages.LandingPage;
import com.qtpselenium.facebookpages.LoginPage;
import com.qtpselenium.facebookpages.PersonalProfile;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xlsx_Reader;

public class Logintest extends TestBase {
	
	@Before
	public void checkRunMode(){
		Xlsx_Reader xls= new Xlsx_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\Testcase.xlsx");
		if(!TestUtil.isExecutable("LoginTest", xls))
			System.out.println("skip");
//			throw new SkipException("skipping the test");
	}
	@Test
	public void testMain(){
		initConfigurations();// it will not again initialize because driver is already initialized
		initDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		TestUtil.takeScreenshot("hello");
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		LandingPage landingpage=lp.doLogin("angad.arora22@gmail.com", "Sagu.001yadu");
		Assert.assertTrue( landingpage!=null,"could not login");
		APPLICATION_LOGS.debug("Logged in");
		PersonalProfile pp=landingpage.goToProfile();
		APPLICATION_LOGS.debug("in profile page");
	    pp.loadFriendList();
		
	}

}



