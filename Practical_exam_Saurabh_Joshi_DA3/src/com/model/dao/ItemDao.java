package com.model.dao;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.Item;


public interface ItemDao {
	public Item store(Item item);
	public FoodItems[] fetchFoodItems();
	public Apparel[] fetchApparel();
	public Electronics[] fetchElectronics();
}
