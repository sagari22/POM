package com.qtpselenium.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qtpselenium.testcases.TestBase;

public class TestUtil {

	//True-test has to be executed
	//false-Test has to be skipped
	public static boolean isExecutable(String testName, Xlsx_Reader xls){
		
	
		for(int rowNum=2;rowNum<=xls.getRowCount("Test Cases");rowNum++){
			
			if(xls.getCellData("Test Cases", "TCID", rowNum).equals(testName))
				
			if(xls.getCellData("Test Cases", "RunMode", rowNum).equals("Y"))
				return true;
			else	
	
		return false;
}
		return false;
}
	
	public static void takeScreenshot(String fileName){
		File srcFile =((TakesScreenshot)(TestBase.driver)).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".jpg"));
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}