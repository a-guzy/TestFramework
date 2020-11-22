package com.salesforce;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class CreateAccount {
	
	@Before
	//login
	void login() {
		//Login:

	}
	

	@Test
	void createAccountAndVerify() {
		//Pages.accountsPage().goTo();
		Pages.homePage().goTo();
		Pages.homePage().login();
		//WAIT!
		WebDriverWait wait = new WebDriverWait(Browser.driver, 30);
		wait.until(ExpectedConditions.urlContains("lightning.force.com"));
		
		Pages.accountsPage().goTo();
		SalesforcePage salesforcePage = Pages.accountsPage().getSalesforcePage("New");
		salesforcePage.goTo();
		Assert.assertTrue(salesforcePage.isAtSalesforcePage("New"));
	}
	
	@Test
	void editAccount() {
		
	}
	
	@AfterClass
	public static void cleanUp() {
		Browser.close();
	}

}
