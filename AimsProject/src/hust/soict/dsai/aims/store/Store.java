package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Added media to store: " + media.getTitle());
        } else {
            System.out.println("Media is already in the store.");
        }
    }
    
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed media from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    public void displayStore() {
        System.out.println("Items in Store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    public void displayItems() {
        System.out.println("Items in Store:");
        for (Media media : itemsInStore) {
            System.out.println(media);
        }
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; 
    }
}
