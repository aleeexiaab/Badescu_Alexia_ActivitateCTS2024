package Problem_7;

public class Main7 {
    public static void main(String[] args) {
        IBill bill = new Bill(15.5);
        IBill decoratedBill = new ConcreteHolidayBillDecorator(bill);

        decoratedBill.print();
    }
}
