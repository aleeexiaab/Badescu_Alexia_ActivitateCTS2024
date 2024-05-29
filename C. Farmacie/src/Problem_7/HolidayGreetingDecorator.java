package Problem_7;

public class HolidayGreetingDecorator extends ReceiptDecorator{
    public HolidayGreetingDecorator(Receipt decoratedReceipt) {
        super(decoratedReceipt);
    }

    @Override
    public void print() {
        decoratedReceipt.print();
        printHolidayGreeting();
    }

    private void printHolidayGreeting() {
        System.out.println("La Mulți Ani!");
    }
}
