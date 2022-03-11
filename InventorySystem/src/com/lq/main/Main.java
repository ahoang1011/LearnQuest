package com.lq.main;

import com.lq.inventory.Book;
import com.lq.inventory.Item;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item[] myInventory = new Item();
		myInventory[0] = new Book("The last ship", 35.99, 5, "William Brinkley", "Ann Hoang", "Sci-fi");
		myInventory[1] = new Book("The Expanse", 135.99, 15, "James Corey", "Aziz Alsalem", "Sci-fi");
		
		myInventory[2] = new CD("Galazy", 49.99, 2, new Artist("Some guy"), new Date("07/07/1977"));
		
	}

}
