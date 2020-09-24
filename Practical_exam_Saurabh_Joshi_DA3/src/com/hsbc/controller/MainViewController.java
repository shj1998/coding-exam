package com.hsbc.controller;

import java.util.Scanner;


import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.utility.ItemFactory;
import com.hsbc.model.utility.Type;
import com.hsnc.model.business.ItemService;

public class MainViewController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		ItemService service = (ItemService) ItemFactory.getInstance(Type.SERVICE);
	int option = 0;
	do {
		System.out.println("*****************************************************************************************");
		System.out.println("1: Store food item  2:Store apparel 3: Store electronics 4: Fetch All 6: Exit");
		System.out.println("*****************************************************************************************");
		option = scanner.nextInt();
		switch(option) {
		case 1: 
			FoodItems item = new FoodItems();
			System.out.println("Enter item code");		
			item.setItemCode(scanner.nextInt());
//			String name = scanner.next();
//			user.setName(name);
			
			System.out.println("Enter Item name");	
			item.setItemName(scanner.next());
			System.out.println("Enter phone no");	
			user.setPhone(scanner.nextLong());
			User createdUser = service.storeUser(user);
			System.out.println("User created with an id: "+createdUser.getUserId());
			break;
		case 2:
			Item user = new User();
			System.out.println("Enter name");		
			user.setName(scanner.next());
//			String name = scanner.next();
//			user.setName(name);
			
			System.out.println("Enter password");	
			user.setPassword(scanner.next());
			System.out.println("Enter phone no");	
			user.setPhone(scanner.nextLong());
			User createdUser = service.storeUser(user);
			System.out.println("User created with an id: "+createdUser.getUserId());
			break;
		case 3:
			Item user = new User();
			System.out.println("Enter name");		
			user.setName(scanner.next());
//			String name = scanner.next();
//			user.setName(name);
			
			System.out.println("Enter password");	
			user.setPassword(scanner.next());
			System.out.println("Enter phone no");	
			user.setPhone(scanner.nextLong());
			User createdUser = service.storeUser(user);
			System.out.println("User created with an id: "+createdUser.getUserId());
			break;
		case 4: 
			FoodItems[] items = service.fetchFoodItems();
			for(FoodItems temp : items) {
				if(temp!=null)
				System.out.println(temp);
			}
			Apparel[] users = service.fetchApparel();
			for(Apparel temp : users) {
				if(temp!=null)
				System.out.println(temp);
			}
			Electronics[] users = service.fetchElectronics();
			for(Electronics temp : users) {
				if(temp!=null)
				System.out.println(temp);
			}
			break;
		
		}
	} while(option != 6);
	
	scanner.close();
}

	

}
