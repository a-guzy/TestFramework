package com.salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static String url = "https://test.salesforce.com/";
	static String title = "Login | Salesforce";
	
	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public void login() {
		Pages.homePage().goTo();
		WebElement userField = Browser.driver.findElement(By.id("username")); 
		userField.sendKeys("a.guzy-f3pb@force.com");
		WebElement passField = Browser.driver.findElement(By.id("password")); 
		passField.sendKeys("fakePass3");
		passField.submit(); //hit the enter key
		//Browser.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
