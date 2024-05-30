package Problem_6;

public class Main {
    public static void main(String[] args) {
        Card bankCard = new BankCard();
        Card contactlessCard = new ContactlessPaymentCard(bankCard);

        System.out.println("Using bank card with regular payments:");
        bankCard.makeOnlinePayment();
        bankCard.makeNormalPayment();

        System.out.println("\nUsing bank card with contactless payments:");
        contactlessCard.makeOnlinePayment();
        contactlessCard.makeNormalPayment();
    }
}
