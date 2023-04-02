package dto;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private long contact;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String toString() {
		return productId+"\t\t"+productName+"\t\t"+productPrice+"\t\t"+contact;
	}		

}
