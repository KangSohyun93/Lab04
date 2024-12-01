package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        } else {
            System.out.println(media.getTitle() + " is already in the cart.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void displayCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Media media : itemsOrdered) {
                System.out.println(media.toString());
            }
        }
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public List<Media> filterCart(String criterion, String value) {
        List<Media> filteredList = new ArrayList<>();
        switch (criterion.toLowerCase()) {
            case "id":
                try {
                    int id = Integer.parseInt(value);
                    filteredList = itemsOrdered.stream()
                        .filter(media -> media.getId() == id)
                        .collect(Collectors.toList());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid ID input.");
                }
                break;
            case "title":
                filteredList = itemsOrdered.stream()
                    .filter(media -> media.getTitle().equalsIgnoreCase(value))
                    .collect(Collectors.toList());
                break;
            default:
                System.out.println("Invalid filter criterion.");
                break;
        }
        return filteredList;
    }

    public void placeOrder() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty. Please add some items to place an order.");
        } else {
            System.out.println("Order placed successfully!");
            System.out.println("Items in your cart: ");
            for (Media media : itemsOrdered) {
                System.out.println(media);
            }
            itemsOrdered.clear();
            System.out.println("Your cart is now empty.");
        }
    }

    public void removeFromCart(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media removed from cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in cart.");
        }
    }

    public void sortCart(String sortBy) {
        if (sortBy.equalsIgnoreCase("title")) {
            Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
            System.out.println("Sorted by title then cost.");
        } else if (sortBy.equalsIgnoreCase("cost")) {
            Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
            System.out.println("Sorted by cost then title.");
        } else {
            System.out.println("Invalid sorting option.");
        }
    }
}
