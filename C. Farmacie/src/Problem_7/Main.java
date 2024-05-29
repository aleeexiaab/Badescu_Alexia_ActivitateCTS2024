package Problem_7;

public class Main {
    public static void main(String[] args) {
        Receipt basicReceipt = new BasicReceipt();
        Receipt decoratedReceipt = new HolidayGreetingDecorator(basicReceipt);

        decoratedReceipt.print();
    }
}
