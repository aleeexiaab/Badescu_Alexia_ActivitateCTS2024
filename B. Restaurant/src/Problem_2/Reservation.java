package Problem_2;

public class Reservation {
    private boolean windowSeat;
    private boolean ergonomicChairs;
    private boolean tableDecoration;
    private boolean customAmbientMusic;
    private String musicGenre;

    public Reservation(boolean windowSeat, boolean ergonomicChairs, boolean tableDecoration, boolean customAmbientMusic, String musicGenre) {
        this.windowSeat = windowSeat;
        this.ergonomicChairs = ergonomicChairs;
        this.tableDecoration = tableDecoration;
        this.customAmbientMusic = customAmbientMusic;
        this.musicGenre = musicGenre;
    }

    public boolean isWindowSeat() {
        return windowSeat;
    }

    public boolean isErgonomicChairs() {
        return ergonomicChairs;
    }

    public boolean isTableDecoration() {
        return tableDecoration;
    }

    public boolean isCustomAmbientMusic() {
        return customAmbientMusic;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "windowSeat=" + windowSeat +
                ", ergonomicChairs=" + ergonomicChairs +
                ", tableDecoration=" + tableDecoration +
                ", customAmbientMusic=" + customAmbientMusic +
                ", musicGenre='" + musicGenre + '\'' +
                '}';
    }
}
