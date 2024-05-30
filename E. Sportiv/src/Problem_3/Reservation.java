package Problem_3;

public class Reservation {
    private boolean foodIncluded;
    private boolean ergonomicSeat;
    private boolean drinkIncluded;
    private boolean personalizedMusic;
    private String musicGenre;

    private Reservation(Builder builder) {
        this.foodIncluded = builder.foodIncluded;
        this.ergonomicSeat = builder.ergonomicSeat;
        this.drinkIncluded = builder.drinkIncluded;
        this.personalizedMusic = builder.personalizedMusic;
        this.musicGenre = builder.musicGenre;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "foodIncluded=" + foodIncluded +
                ", ergonomicSeat=" + ergonomicSeat +
                ", drinkIncluded=" + drinkIncluded +
                ", personalizedMusic=" + personalizedMusic +
                ", musicGenre='" + musicGenre + '\'' +
                '}';
    }

    public static class Builder {
        private boolean foodIncluded = false;
        private boolean ergonomicSeat = false;
        private boolean drinkIncluded = false;
        private boolean personalizedMusic = false;
        private String musicGenre = "";

        public Builder setFoodIncluded(boolean foodIncluded) {
            this.foodIncluded = foodIncluded;
            return this;
        }

        public Builder setErgonomicSeat(boolean ergonomicSeat) {
            this.ergonomicSeat = ergonomicSeat;
            return this;
        }

        public Builder setDrinkIncluded(boolean drinkIncluded) {
            this.drinkIncluded = drinkIncluded;
            return this;
        }

        public Builder setPersonalizedMusic(boolean personalizedMusic) {
            this.personalizedMusic = personalizedMusic;
            return this;
        }

        public Builder setMusicGenre(String musicGenre) {
            this.musicGenre = musicGenre;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }
}
