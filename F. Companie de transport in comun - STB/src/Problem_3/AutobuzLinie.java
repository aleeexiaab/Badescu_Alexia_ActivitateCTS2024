package Problem_3;

public final class AutobuzLinie {
    private final String model;
    private final String sofer;
    private final boolean opririLaCapatDeLinie;
    private final boolean deschideUsiInFiecareStatie;
    private final String textAfisat;
    private final int alteElemente;

    private AutobuzLinie(Builder builder) {
        this.model = builder.model;
        this.sofer = builder.sofer;
        this.opririLaCapatDeLinie = builder.opririLaCapatDeLinie;
        this.deschideUsiInFiecareStatie = builder.deschideUsiInFiecareStatie;
        this.textAfisat = builder.textAfisat;
        this.alteElemente = builder.alteElemente;
    }

    public String getModel() {
        return model;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean isOpririLaCapatDeLinie() {
        return opririLaCapatDeLinie;
    }

    public boolean isDeschideUsiInFiecareStatie() {
        return deschideUsiInFiecareStatie;
    }

    public String getTextAfisat() {
        return textAfisat;
    }

    public int getAlteElemente() {
        return alteElemente;
    }

    public static class Builder {
        private final String model;
        private final String sofer;
        private boolean opririLaCapatDeLinie = true; // Default value
        private boolean deschideUsiInFiecareStatie = true; // Default value
        private String textAfisat = "Default Text"; // Default value
        private int alteElemente = 0; // Default value

        public Builder(String model, String sofer) {
            this.model = model;
            this.sofer = sofer;
        }

        public Builder opririLaCapatDeLinie(boolean opririLaCapatDeLinie) {
            this.opririLaCapatDeLinie = opririLaCapatDeLinie;
            return this;
        }

        public Builder deschideUsiInFiecareStatie(boolean deschideUsiInFiecareStatie) {
            this.deschideUsiInFiecareStatie = deschideUsiInFiecareStatie;
            return this;
        }

        public Builder textAfisat(String textAfisat) {
            this.textAfisat = textAfisat;
            return this;
        }

        public Builder alteElemente(int alteElemente) {
            this.alteElemente = alteElemente;
            return this;
        }

        public AutobuzLinie build() {
            return new AutobuzLinie(this);
        }
    }
}
