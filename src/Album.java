import java.io.Serializable;

public class Album implements Serializable {

    private String name;
    private String band;
    private String firstTrack;

    public Album(String name, String band, String firstTrack) {
        this.name = name;
        this.band = band;
        this.firstTrack = firstTrack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getFirstTrack() {
        return firstTrack;
    }

    public void setFirstTrack(String firstTrack) {
        this.firstTrack = firstTrack;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAuthor: " + band + "\nFirst track: " + firstTrack + "\n";
    }
}
