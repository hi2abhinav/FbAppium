package facebook.FacebookApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class AppTest extends Utils{
	
	@Test(priority=0)
	public void Signin() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\FacebookApp\\src\\test\\java\\facebook\\FacebookApp\\DataDriven.properties");
		prop.load(fis);
		
		LoginPage lp = new LoginPage(driver);
		lp.emailid().sendKeys(prop.getProperty("email"));
		lp.pwd().click();
		lp.pwd().sendKeys(prop.getProperty("password"));
		lp.submit().click();
		lp.locate().click();
	}

	@Test(priority=1)
	public void Search() throws InterruptedException{
		FbPage fp = new FbPage(driver);
		fp.search().sendKeys("Whisper");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(2000);
		fp.keyword().click();
		Thread.sleep(2000);
		driver.swipe(470, 1550, 470, 500, 2000);
		driver.swipe(470, 1750, 470, 200, 2000);
		driver.swipe(470, 1750, 470, 200, 2000);
		driver.swipe(470, 1750, 470, 200, 2000);
		driver.swipe(470, 1750, 470, 200, 2000);
		driver.swipe(470, 1750, 470, 200, 2000);
		fp.story().click();
		Thread.sleep(5000);
		fp.closead().click();
	}

}
