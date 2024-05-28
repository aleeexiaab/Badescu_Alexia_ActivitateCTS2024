package Problem_5;

public class Main5 {
    public static void main(String[] args) {
        IKitchenSoftware5 kitchenSoftware = new KitchenSoftware5();
        IKitchenSoftware5 adapter = new BarToKitchenAdapter5(new BarSoftware5());

        kitchenSoftware.printInvoice("Kitchen order: 3 burgers");
        adapter.printInvoice("Bar order: 2 beers");
    }
}
