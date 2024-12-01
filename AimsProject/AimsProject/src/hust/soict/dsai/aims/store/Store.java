package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_ITEMS = 50;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
	private int numOfItems = 0;

	public void addDVD(DigitalVideoDisc dvd) {
		if (numOfItems < MAX_ITEMS) {
			itemsInStore[numOfItems] = dvd;
			numOfItems++;
			System.out.println("Added DVD: " + dvd.getTitle());
		} else {
			System.out.println("Store is full. Cannot add more DVDs.");
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < numOfItems; i++) {
			if (itemsInStore[i] == dvd) {
				for (int j = i; j < numOfItems - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				itemsInStore[numOfItems - 1] = null;
				numOfItems--;
				System.out.println("Removed DVD: " + dvd.getTitle());
				return;
			}
		}
		System.out.println("DVD not found in store: " + dvd.getTitle());
	}

	public void printStore() {
		System.out.println("***********************STORE***********************");
		System.out.println("Items in Store:");
		for (int i = 0; i < numOfItems; i++) {
			System.out.printf("%d. %s\n", i + 1, itemsInStore[i].getTitle());
		}
		System.out.println("**************************************************");
	}
}
