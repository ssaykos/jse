package oop04.abstraction;

public abstract class ProductInfo {
	protected String productCompany;
	protected String productName;
	protected String productSerialID;
	
	public void setProductInpo(String produtCompany, String productName, String productSerialID) {
		this.productCompany = produtCompany;
		this.productName = productName;
		this.productSerialID = productSerialID;
	}
	public abstract void displayProductInfo();
	
}
