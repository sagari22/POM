package rough;

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

import com.qtpselenium.facebookpages.LandingPage;
import com.qtpselenium.facebookpages.LoginPage;
import com.qtpselenium.facebookpages.PersonalProfile;

public class TestLogin {
	
	@Before
	public void setUp(){
		//Initializing config file
		//initializing logs
		
		
	}
	@Test
	public void testMain(){
		
		//initializing logs
		Logger APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("starting test");
		// initializing config file
		Properties Config =new Properties();
		try{
			FileInputStream fs=new FileInputStream("");
			
		}
		catch(Exception e){
			
		}
		WebDriver driver=null;
		if(Config.getProperty("browser").equals("Mozilla"))
			driver= new FirefoxDriver();
		else if(Config.getProperty("browser").equals("Chrome"))
			driver= new ChromeDriver();
		else if(Config.getProperty("browser").equals("internetexplorer"))
			driver= new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		LandingPage landingpage=lp.doLogin("sagari.sabharwal@hotmail.com", "silkysarang1");
		APPLICATION_LOGS.debug("Logged in");
		landingpage.goToProfile();
		APPLICATION_LOGS.debug("in profile page");
//		PersonalProfile pp= pp.loadFriendList();
		
	}

}
