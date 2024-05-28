package Problem_11;

public class CardPayment11 implements PaymentStrategy11{

    private String cardNumber;
    private String cardHolderName;

    public CardPayment11(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card. Card Number: " + cardNumber + ", Card Holder: " + cardHolderName);
    }
}
