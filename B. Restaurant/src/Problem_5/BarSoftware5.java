package Problem_5;

public class BarSoftware5 implements IBarSoftware5 {
    @Override
    public void printReceipt(String orderDetails) {
        System.out.println("Print receipt for bar order: " + orderDetails);
    }
}
