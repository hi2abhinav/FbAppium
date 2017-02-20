package facebook.FacebookApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class FbPage {
	
public static AppiumDriver driver = Utils.driver;
	
	public FbPage(AppiumDriver driver){
		this.driver = driver;
	}

	By search = By.id("com.facebook.katana:id/search_edit_text");
	By keyword = By.id("com.facebook.katana:id/keyword_search_content_view");
	By story = By.id("com.facebook.katana:id/link_attachment_large_photo");
	By closead = By.id("oop-x");
	
	public WebElement search(){
		return driver.findElement(search);
	}
	
	public WebElement keyword(){
		return driver.findElement(keyword);
	}	
	
	public WebElement story(){
		return driver.findElement(story);
	}

	public WebElement closead(){
		return driver.findElement(closead);
	}
}
