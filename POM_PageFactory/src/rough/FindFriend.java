package rough;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qtpselenium.facebookpages.LandingPage;
import com.qtpselenium.facebookpages.LoginPage;
import com.qtpselenium.facebookpages.PersonalProfile;
import com.qtpselenium.facebookpages.friendList;
import com.qtpselenium.util.TestUtil;

public class FindFriend {
	@Test
	public void TestFriend(){
		WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	LandingPage landingpage=lp.doLogin("sagari.sabharwal@hotmail.com", "silkysarang1");
	PersonalProfile personalprofile =landingpage.goToProfile();
	try{
		Assert.assertTrue(false, "2");
		}catch(Throwable e){
			TestUtil.takeScreenshot("friend");
			return;
		}
	friendList friendlist=personalprofile.loadFriendList();
	
	boolean b = friendlist.findAfriend("Silky Arora");
	if(b)
		System.out.println("found friend");
	else
		System.out.println("not found");
	}
}
