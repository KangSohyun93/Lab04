package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);  // Gọi constructor của Disc với 5 tham số
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc [ID=" + getId() + ", Title=" + getTitle() + 
               ", Category=" + getCategory() + ", Cost=" + getCost() +
               ", Director=" + getDirector() + ", Length=" + getLength() + " minutes]";
    }
}
