package Problem_7;

public class ConcreteHolidayBillDecorator extends AbstractBillDecorator {
    public ConcreteHolidayBillDecorator(IBill decoratedBill) {
        super(decoratedBill);
    }

    private void printHolidayGreeting() {
        System.out.println("Happy holidays!");
    }

    @Override
    public void print() {
        decoratedBill.print();
        printHolidayGreeting();
    }
}
