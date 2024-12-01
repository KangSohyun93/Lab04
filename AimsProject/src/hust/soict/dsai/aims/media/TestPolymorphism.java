package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();

        Book book = new Book("Harry Potter", "Fantasy", 19.99f);
        book.addAuthor("J.K. Rowling");

        List<Track> cdTracks = Arrays.asList(
                new Track("Track 1", 120),
                new Track("Track 2", 180)
        );
        CD cd = new CD("Greatest Hits", "Music", "The Beatles", "George Martin", cdTracks, 15.99f);

        DigitalVideoDisc dvd = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 24.99f);

        mediaList.add(book);
        mediaList.add(cd);
        mediaList.add(dvd);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
