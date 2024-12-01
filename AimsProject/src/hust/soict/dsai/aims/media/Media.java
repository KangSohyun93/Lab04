package hust.soict.dsai.aims.media;
import java.util.Objects;
import java.util.Comparator;
import Comparator.MediaComparatorByCostTitle;
import Comparator.MediaComparatorByTitleCost;


public abstract class Media {
    private static int nbMedia = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia; 
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static int getNbMedia() {
        return nbMedia;
    }

    // Thêm phương thức play() vào Media
    public void play() {
        System.out.println("Playing media: " + title);
    }

    @Override
    public String toString() {
        return "Media [ID=" + id + ", Title=" + title + ", Category=" + category + ", Cost=" + cost + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; 
        }
        if (o == null || getClass() != o.getClass()) {
            return false; 
        }
        
        Media media = (Media) o;
        return title != null ? title.equals(media.title) : media.title == null; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category);
    }
}
