package com.salesforce;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

class canGoToHomePage {

	@Test 
	void goToHomePage() {
		Pages.homePage().goTo(); //navigate to homepage
		Assert.assertTrue(Pages.homePage().isAt()); //make sure we are at that page
	}

}
