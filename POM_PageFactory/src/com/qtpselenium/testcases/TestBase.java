package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {

	public static Logger APPLICATION_LOGS = null;
	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public static boolean isLoggedIn=false;
	
	public void initConfigurations(){
	if(CONFIG==null){
		//logging
		APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
		//config.prop
		CONFIG =new Properties();
		try{
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//src//com//qtpselenium//config/config.properties");
			CONFIG.load(fs);
			
		}
		catch(Exception e)
		{
			e.printStackTrace()	;
			
		}
	}
	}
	public void initDriver(){
		if(driver==null){
			if(CONFIG.getProperty("browser").equals("firefox"))
			driver= new FirefoxDriver();
		else if(CONFIG.getProperty("browser").equals("Chrome"))
			driver= new ChromeDriver();
		else if(CONFIG.getProperty("browser").equals("internetexplorer"))
			driver= new InternetExplorerDriver();
		}
	}
	
	public void quitDriver(){
		driver.quit();
		driver=null;
	}
}
