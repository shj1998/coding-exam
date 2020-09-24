package com.hsbc.model.beans;

public class Apparel extends Item{
	
	private String size; // S , M , L ,XL
	private String material; // cotton or wool 
		
	public Apparel(int itemCode, String itemName, double unitPrice, String size, String material, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.size = size;
		this.material = material;
	}

	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", size=" + size + ", material="
				+ material + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
