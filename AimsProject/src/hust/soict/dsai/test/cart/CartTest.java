package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.media.*;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Media book = new Book("Java Programming", "Programming", 20.99f);
        Media dvd = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 15.99f);
        Media cd = new CompactDisc("Greatest Hits", "Pop", "Various Artists", 0, 19.99f, "Pop Artist");

        cart.addMedia(book);
        cart.addMedia(dvd);
        cart.addMedia(cd);

        cart.displayCart();

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeMedia(dvd);

        cart.displayCart();
    }
}
