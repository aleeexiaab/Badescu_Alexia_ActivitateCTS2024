package Problem_1;

public class Patient1 {
    private String name;
    private boolean adjustableBed;
    private boolean breakfastIncluded;
    private boolean roomSlippers;
    private boolean indoorGown;

    private Patient1(PatientBuilder builder) {
        this.name = builder.name;
        this.adjustableBed = builder.adjustableBed;
        this.breakfastIncluded = builder.breakfastIncluded;
        this.roomSlippers = builder.roomSlippers;
        this.indoorGown = builder.indoorGown;
    }

    public static class PatientBuilder {
        private String name;
        private boolean adjustableBed = false;
        private boolean breakfastIncluded = false;
        private boolean roomSlippers = false;
        private boolean indoorGown = false;

        public PatientBuilder(String name) {
            this.name = name;
        }

        public PatientBuilder setAdjustableBed(boolean adjustableBed) {
            this.adjustableBed = adjustableBed;
            return this;
        }

        public PatientBuilder setBreakfastIncluded(boolean breakfastIncluded) {
            this.breakfastIncluded = breakfastIncluded;
            return this;
        }

        public PatientBuilder setRoomSlippers(boolean roomSlippers) {
            this.roomSlippers = roomSlippers;
            return this;
        }

        public PatientBuilder setIndoorGown(boolean indoorGown) {
            this.indoorGown = indoorGown;
            return this;
        }

        public Patient1 build() {
            return new Patient1(this);
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", adjustableBed=" + adjustableBed +
                ", breakfastIncluded=" + breakfastIncluded +
                ", roomSlippers=" + roomSlippers +
                ", indoorGown=" + indoorGown +
                '}';
    }
}
