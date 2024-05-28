package Problem_7;

public class AbstractBillDecorator implements IBill {
    protected IBill decoratedBill;

    public AbstractBillDecorator(IBill decoratedBill) {
        this.decoratedBill = decoratedBill;
    }

    @Override
    public void print() {
        decoratedBill.print();
    }
}
