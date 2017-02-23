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
	By share = By.id("com.facebook.katana:id/browser_action_button");
	By post = By.id("com.facebook.katana:id/primary_named_button");
	By close = By.id("com.facebook.katana:id/close_button");
	By text = By.id("com.facebook.katana:id/link_attachment_title_text");
	By back = By.id("com.facebook.katana:id/fb_logo_up_button");
	
	public WebElement search(){
		return driver.findElement(search);
	}
	
	public WebElement keyword(){
		return driver.findElement(keyword);
	}	
	
	public WebElement story(){
		return driver.findElement(story);
	}

	public WebElement share(){
		return driver.findElement(share);
	}

	public WebElement post(){
		return driver.findElement(post);
	}

	public WebElement close(){
		return driver.findElement(close);
	}

	public WebElement text(){
		return driver.findElement(text);
	}
	
	public WebElement back(){
		return driver.findElement(back);
	}
	
}

