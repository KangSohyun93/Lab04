package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, cost, director, length);  
        this.artist = artist;
        this.tracks = new ArrayList<>(); 
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();  
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();  
        }
    }

    @Override
    public String toString() {
        return "CompactDisc [ID=" + getId() + ", Title=" + getTitle() + 
               ", Category=" + getCategory() + ", Cost=" + getCost() +
               ", Artist=" + artist + ", Tracks=" + tracks.size() + "]";
    }
}
