package com.hsnc.model.business;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.Item;
import com.hsbc.model.utility.ItemFactory;
import com.hsbc.model.utility.Type;
import com.model.dao.ItemDao;

public class ItemServiceImpl implements ItemService{

	private ItemDao dao;
	
	
	public ItemServiceImpl() {
		dao = (ItemDao)ItemFactory.getInstance(Type.DAO);
	}


	@Override
	public Item storeItem(Item item) {
		// calls the dao method to store created item
		Item createdRecord =  dao.store(item);
		return createdRecord;
	}


	@Override
	public FoodItems[] fetchFoodItems() {
		// returns food items
		return dao.fetchFoodItems();
	}


	@Override
	public Apparel[] fetchApparel() {
		// returns apparel items 
		return dao.fetchApparel();
	}


	@Override
	public Electronics[] fetchElectronics() {
		// returns electronics items
		return dao.fetchElectronics();
	}

}
