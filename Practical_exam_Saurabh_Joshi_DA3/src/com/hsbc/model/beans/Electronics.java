package com.hsbc.model.beans;

public class Electronics extends Item{
	
	private int warranty;
	private int quantity;
	public Electronics(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.warranty = warranty;
	}
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}
	
	

}
