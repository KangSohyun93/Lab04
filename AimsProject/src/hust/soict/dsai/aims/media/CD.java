package hust.soict.dsai.aims.media;

import java.util.List;

public class CD extends Media {
    private String artist;
    private String director;
    private List<Track> tracks;

    public CD(String title, String category, String artist, String director, List<Track> tracks, float cost) {
        super(title, category, cost);
        this.artist = artist;
        this.director = director;
        this.tracks = tracks;
    }


    public String getArtist() {
        return artist;
    }

    public String getDirector() {
        return director;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public int getTotalLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        for (Track track : tracks) {
            if (track.getLength() > 0) {
                System.out.println("Playing track: " + track.getTitle() + " (" + track.getLength() + " seconds)");
            } else {
                System.out.println("Cannot play track: " + track.getTitle() + " due to invalid length.");
            }
        }
    }

    @Override
    public String toString() {
        return "CD [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() +
               ", Artist=" + artist + ", Director=" + director + ", Tracks=" + tracks.size() + ", Cost=" + getCost() + "]";
    }
}
