package rough;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebookpages.AccountSettings;
import com.qtpselenium.facebookpages.LandingPage;
import com.qtpselenium.facebookpages.LoginPage;
import com.qtpselenium.facebookpages.TopMenu;

public class changePassword {
	@Test
	public void changePass(){
		WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	LandingPage landingpage=lp.doLogin("sagari.sabharwal@hotmail.com", "silkysarang1");
	TopMenu topmenu= PageFactory.initElements(driver, TopMenu.class);
	AccountSettings accsettings = topmenu.gotoAccountSettings();
	accsettings.changePassword("silkysarang1", "Sagyad_Aniket");

}
	}
