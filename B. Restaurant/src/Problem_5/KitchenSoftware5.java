package Problem_5;

public class KitchenSoftware5 implements IKitchenSoftware5 {
    @Override
    public void printInvoice(String orderDetails) {
        System.out.println("Print invoice for kitchen order: " + orderDetails);
    }
}
