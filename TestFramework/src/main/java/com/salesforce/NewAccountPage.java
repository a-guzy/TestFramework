package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends SalesforcePage {
	
	//@FindBy(how = How.CSS, using = ""); 
	//WebElement pageElement;

	@Override
	public void goTo() {
		Browser.driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div")).click();
	   // Browser.driver.findElements(By.cssSelector("a[class=forceActionLink]")).get(0).click();
	}

	@Override
	public String pathName() {
		// TODO Auto-generated method stub
		return null;
	}

}
