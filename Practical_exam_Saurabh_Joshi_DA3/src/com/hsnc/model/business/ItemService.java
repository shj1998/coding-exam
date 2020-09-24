package com.hsnc.model.business;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.Item;

public interface ItemService {
	
	public Item storeItem(Item item);
	public FoodItems[] fetchFoodItems();
	public Apparel[] fetchApparel();
	public Electronics[] fetchElectronics();
}
