package com.qtpselenium.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xlsx_Reader;

public class Test1 {
	
	public static void main(String[] args){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://gmail.com");

		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileUtils.copyFile(srcFile, new File("C:\\Users\\d059035\\Documents\\SagaraiDocs\\google.jpg"));
				
			}catch(IOException e){
				e.printStackTrace();
			}
			
			
		}	}

