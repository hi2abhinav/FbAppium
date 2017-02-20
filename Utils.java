package facebook.FacebookApp;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utils {
	
public static AndroidDriver driver;
	
	@BeforeClass
	public static void CreateEnvironment() throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("deviceName", "A0001");
		cap.setCapability("app", "C:\\Users\\hi2abhinav\\Downloads\\facebook.apk");
		cap.setCapability("appPackage", "com.facebook.katana");
		cap.setCapability("appActivity", "LoginActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	/*@AfterClass
	public static void CloseEnvironment() throws InterruptedException{
		driver.quit();
	}*/

}
