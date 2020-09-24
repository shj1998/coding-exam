package com.hsbc.model.beans;

public class FoodItems extends Item{
	
	private String dom; // Date of Manufacture
	private String doe; // Date of Expiry
	boolean veg; // if veg or not
	
	
	
	public FoodItems(int itemCode, String itemName, double unitPrice, String dom, String doe, boolean veg,
			int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.dom = dom;
		this.doe = doe;
		this.veg = veg;
	}

	public FoodItems() {
		super();
	}


	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getDoe() {
		return doe;
	}

	public void setDoe(String doe) {
		this.doe = doe;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", dom=" + dom + ", doe=" + doe
				+ ", veg=" + veg + "]";
	}
	
	
}
