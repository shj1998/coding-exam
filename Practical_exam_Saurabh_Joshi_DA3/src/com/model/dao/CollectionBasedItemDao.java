package com.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.Item;


public class CollectionBasedItemDao implements ItemDao{

	
	ArrayList<FoodItems> foodList = new ArrayList<FoodItems>(); //List to store food item objects
	ArrayList<Apparel> appList = new ArrayList<Apparel>();// list to store apparel objects
	ArrayList<Electronics> elexList = new ArrayList<Electronics>();// list to store electronic objects
	@Override
	public Item store(Item item) {  
		// Stores the created object in the respective lists.
		if(item instanceof FoodItems) {
			FoodItems foodItem = (FoodItems) item;
			foodList.add(foodItem);
		}
		if(item instanceof Apparel) {
			Apparel appItem = (Apparel) item;
			appList.add(appItem);
		}
		if(item instanceof Electronics) {
			Electronics elexItem = (Electronics) item;
			elexList.add(elexItem);
		}
		return item;
	}
	@Override
	public FoodItems[] fetchFoodItems() {
		// fetches all food items
		FoodItems[] food_array = foodList.toArray(new FoodItems[foodList.size()]);
		return food_array;
	}
	@Override
	public Apparel[] fetchApparel() {
		// fetches all apparel items
		Apparel[] app_array = appList.toArray(new Apparel[appList.size()]);
		return app_array;
	
	}
	@Override
	public Electronics[] fetchElectronics() {
		// fetches all electronics items
		Electronics[] elex_array = elexList.toArray(new Electronics[elexList.size()]);
		return elex_array;
	}

	
}
