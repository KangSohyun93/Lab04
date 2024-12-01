package Aims;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import java.util.Scanner;

public class Aims {

    static Scanner scanner = new Scanner(System.in);
    static Store store = new Store();

    public static void main(String[] args) {
        store.addMedia(new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 120, 20.0f));
        store.addMedia(new CD("The Dark Side of the Moon", "Rock", "Pink Floyd", "Some Director", new ArrayList<Track>(), 15.0f));
        store.addMedia(new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 25.0f));

        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    System.out.println("Update store logic...");
                    break;
                case 3:
                    cartMenu();
                    int cartOption = scanner.nextInt();
                    switch (cartOption) {
                        case 1:
                            System.out.println("Filter logic...");
                            break;
                        case 2:
                            sortCartMenu();
                            break;
                        case 3:
                            removeMediaFromCart();
                            break;
                        case 4:
                            playMedia();
                            break;
                        case 5:
                            placeOrder();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (option != 0);
    }

    private static void showMenu() {
        System.out.println("===== AIMS Program =====");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. Cart menu");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void cartMenu() {
        System.out.println("===== Cart Menu =====");
        System.out.println("1. Filter media");
        System.out.println("2. Sort media");
        System.out.println("3. Remove media");
        System.out.println("4. Play media");
        System.out.println("5. Place order");
        System.out.println("0. Back to main menu");
        System.out.print("Enter your choice: ");
    }

    private static void sortCartMenu() {
        System.out.println("Sorting cart...");
    }

    private static void viewStore() {
        System.out.println("===== Store =====");
        store.displayStore();
    }

    private static void removeMediaFromCart() {
        System.out.println("Removing media from cart...");
    }

    private static void playMedia() {
        System.out.println("Playing media...");
    }

    private static void placeOrder() {
        System.out.println("Placing order...");
    }
}
