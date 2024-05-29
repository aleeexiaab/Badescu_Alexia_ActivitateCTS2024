package Problem_3;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice.Builder()
                .numarPungi(2)
                .plataCuCard(true)
                .cardFidelitate(true)
                .cotaTVA(19.0)
                .build();

        Invoice invoice2 = new Invoice.Builder()
                .numarPungi(1)
                .plataCuCard(false)
                .cardFidelitate(false)
                .cotaTVA(0.0)
                .build();

        System.out.println(invoice1);
        System.out.println(invoice2);
    }
}
