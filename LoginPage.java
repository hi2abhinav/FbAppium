package facebook.FacebookApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class LoginPage {
	public static AppiumDriver driver = Utils.driver;
	
	public LoginPage(AppiumDriver driver){
		this.driver = driver;
	}

	By username = By.id("com.facebook.katana:id/login_username");
	By password = By.id("com.facebook.katana:id/login_password");
	By enter = By.id("com.facebook.katana:id/login_login");
	By location = By.id("com.android.packageinstaller:id/permission_allow_button");
	By timeline = By.id("com.facebook.katana:id/news_feed_tab");
	
	public WebElement emailid(){
		return driver.findElement(username);
	}
	
	public WebElement pwd(){
		return driver.findElement(password);
	}	
	
	public WebElement submit(){
		return driver.findElement(enter);
	}
	
	public WebElement locate(){
		return driver.findElement(location);
	}
	
	public WebElement timeline(){
		return driver.findElement(timeline);
	}	
}
