package hust.soict.dsai.aims.media;
public abstract class Disc extends Media {
    private String director;
    private int length;

    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Disc [ID=" + getId() + ", Title=" + getTitle() + 
               ", Category=" + getCategory() + ", Cost=" + getCost() + 
               ", Director=" + director + ", Length=" + length + " minutes]";
    }
}
