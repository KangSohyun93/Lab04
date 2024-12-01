package Aims;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) { // Tạo các đối tượng DVD mới
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", 14.99f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 150, 24.99f);
		// In ra số lượng DVD đã tạo và ID của mỗi DVD
		System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
		System.out.println("DVD 1 ID: " + dvd1.getId());
		System.out.println("DVD 2 ID: " + dvd2.getId());
		System.out.println("DVD 3 ID: " + dvd3.getId());
	}
}