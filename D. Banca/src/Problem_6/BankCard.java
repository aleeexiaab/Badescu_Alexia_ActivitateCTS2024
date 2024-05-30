package Problem_6;

public class BankCard implements Card{
    @Override
    public void makeOnlinePayment() {
        System.out.println("Making online payment with the card.");
    }

    @Override
    public void makeNormalPayment() {
        System.out.println("Making normal payment with the card.");
    }
}
