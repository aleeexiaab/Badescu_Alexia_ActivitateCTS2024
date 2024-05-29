package Problem_3;

public class Invoice {
    private final int numarPungi;
    private final boolean plataCuCard;
    private final boolean cardFidelitate;
    private final double cotaTVA;

    private Invoice(Builder builder) {
        this.numarPungi = builder.numarPungi;
        this.plataCuCard = builder.plataCuCard;
        this.cardFidelitate = builder.cardFidelitate;
        this.cotaTVA = builder.cotaTVA;
    }

    public static class Builder {
        private int numarPungi;
        private boolean plataCuCard;
        private boolean cardFidelitate;
        private double cotaTVA;

        public Builder numarPungi(int numarPungi) {
            this.numarPungi = numarPungi;
            return this;
        }

        public Builder plataCuCard(boolean plataCuCard) {
            this.plataCuCard = plataCuCard;
            return this;
        }

        public Builder cardFidelitate(boolean cardFidelitate) {
            this.cardFidelitate = cardFidelitate;
            return this;
        }

        public Builder cotaTVA(double cotaTVA) {
            this.cotaTVA = cotaTVA;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "numarPungi=" + numarPungi +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
