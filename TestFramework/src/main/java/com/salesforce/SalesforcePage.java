package com.salesforce;

public abstract class SalesforcePage {
	
	public abstract void goTo();
	
	public abstract String pathName();

	public boolean isAtSalesforcePage(String pathName) {
		return pathName().equals(pathName);
	}

}
