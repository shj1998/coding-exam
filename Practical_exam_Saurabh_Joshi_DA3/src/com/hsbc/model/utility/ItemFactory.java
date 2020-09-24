package com.hsbc.model.utility;

import com.hsnc.model.business.ItemServiceImpl;
import com.model.dao.CollectionBasedItemDao;

public class ItemFactory {
	// it can return dao, service or controller instance
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new CollectionBasedItemDao(); // makes a DAO layer instance
			break;
		case SERVICE :
			obj = new ItemServiceImpl(); // makes a Service layer instance
			break;
		}
		return obj;
	}
}
