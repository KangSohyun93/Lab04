package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", 14.99f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 150, 24.99f);

		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);

		store.printStore();

		store.removeDVD(dvd2);

		store.printStore();
	}
}
