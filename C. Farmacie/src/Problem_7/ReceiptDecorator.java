package Problem_7;

public abstract class ReceiptDecorator implements Receipt{
    protected Receipt decoratedReceipt;

    public ReceiptDecorator(Receipt decoratedReceipt) {
        this.decoratedReceipt = decoratedReceipt;
    }

    public void print() {
        decoratedReceipt.print();
    }
}
