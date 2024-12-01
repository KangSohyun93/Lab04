package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import hust.soict.dsai.aims.media.*;

public class TestSorting {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(new Book("Harry Potter", "Fantasy", 19.99f));
        mediaList.add(new Book("The Hobbit", "Fantasy", 25.99f));
        mediaList.add(new Book("Harry Potter", "Fantasy", 29.99f));

        System.out.println("Sắp xếp theo giá rồi tiêu đề:");
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        for (Media media : mediaList) {
            System.out.println(media);
        }
        System.out.println("Sắp xếp theo tiêu đề rồi giá:");
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}
