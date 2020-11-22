package com.salesforce;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		HomePage homePage = new HomePage();
		return homePage;
	}

	public static AccountsPage accountsPage() {
		AccountsPage accountsPage = new AccountsPage();
		return accountsPage;
	}

	public static SalesforcePage accountsPathPage() {
		SalesforcePage accountsPage = new NewAccountPage();
		PageFactory.initElements(Browser.driver, accountsPage);
		return accountsPage;
	}
}
