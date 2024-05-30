package Problem_6;

public class CardDecorator implements Card{
    protected Card decoratedCard;

    public CardDecorator(Card decoratedCard) {
        this.decoratedCard = decoratedCard;
    }

    @Override
    public void makeOnlinePayment() {
        decoratedCard.makeOnlinePayment();
    }

    @Override
    public void makeNormalPayment() {
        decoratedCard.makeNormalPayment();
    }
}
