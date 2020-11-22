package com.salesforce;

import org.openqa.selenium.By;

public class AccountsPage {

	static String url = "https://testacme.lightning.force.com/lightning/o/Account/list?filterName=Recent";
	static String title = "Recently Viewed | Accounts | Salesforce";
	
	public void goTo() {
		Browser.goTo(url);
	}

	/*public void goToCreateAccount() {
		Browser.driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div")).click();
		//Browser.driver.findElements(By.cssSelector("a[class=forceActionLink]")).get(0).click();
	}*/
	public SalesforcePage getSalesforcePage(String page) {
		switch (page) {
		case "Accounts":
			return Pages.accountsPathPage();
		}
		return null;
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	

}
