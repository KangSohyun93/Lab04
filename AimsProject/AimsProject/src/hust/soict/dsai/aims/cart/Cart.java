package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		} else {
			System.out.println("The cart is almost full.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc dvd : dvds) {
			if (qtyOrdered < MAX_NUMBER_ORDERED) {
				itemsOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
				System.out.println("The disc has been added: " + dvd.getTitle());
			} else {
				System.out.println("The cart is full.");
				break;
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered < MAX_NUMBER_ORDERED - 1) {
			itemsOrdered[qtyOrdered] = dvd1;
			itemsOrdered[qtyOrdered + 1] = dvd2;
			qtyOrdered += 2;
			System.out.println("The discs have been added: " + dvd1.getTitle() + " and " + dvd2.getTitle());
		} else {
			System.out.println("Not enough space in the cart for two discs.");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("The disc has been removed.");
				return;
			}
		}
		System.out.println("The disc is not found in the cart.");
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrdered[i];
			System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n", i + 1, dvd.getTitle(), dvd.getCategory(),
					dvd.getDirector(), dvd.getLength(), dvd.getCost());
		}
		System.out.printf("Total cost: %.2f\n", totalCost());
		System.out.println("***************************************************");
	}

	public void searchById(int id) {
		boolean found = false;
		for (DigitalVideoDisc dvd : itemsOrdered) {
			if (dvd != null && dvd.getId() == id) {
				System.out.printf("Found DVD: DVD - %s - %s - %s - %d: %.2f $\n", dvd.getTitle(), dvd.getCategory(),
						dvd.getDirector(), dvd.getLength(), dvd.getCost());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No match found for ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (DigitalVideoDisc dvd : itemsOrdered) {
			if (dvd != null && dvd.getTitle().equalsIgnoreCase(title)) {
				System.out.printf("Found DVD: DVD - %s - %s - %s - %d: %.2f $\n", dvd.getTitle(), dvd.getCategory(),
						dvd.getDirector(), dvd.getLength(), dvd.getCost());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No match found for title: " + title);
		}
	}
}
