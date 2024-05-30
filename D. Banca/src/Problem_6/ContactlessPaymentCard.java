package Problem_6;

public class ContactlessPaymentCard extends CardDecorator{
    public ContactlessPaymentCard(Card decoratedCard) {
        super(decoratedCard);
    }

    public void makeContactlessPayment() {
        System.out.println("Making contactless payment with the card.");
    }

    @Override
    public void makeNormalPayment() {
        decoratedCard.makeNormalPayment();
        makeContactlessPayment();
    }
}
