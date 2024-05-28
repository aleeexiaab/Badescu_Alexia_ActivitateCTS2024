package Problem_5;

public class BarToKitchenAdapter5 implements IKitchenSoftware5 {
    private BarSoftware5 barSoftwear;

    public BarToKitchenAdapter5(BarSoftware5 barSoftwear) {
        this.barSoftwear = barSoftwear;
    }

    @Override
    public void printInvoice(String orderDetails) {
        barSoftwear.printReceipt(orderDetails);
    }
}
