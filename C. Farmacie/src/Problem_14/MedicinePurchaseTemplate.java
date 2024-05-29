package Problem_14;

public abstract class MedicinePurchaseTemplate {
    public final void purchaseMedicine() {
        receivePrescription();
        if (checkStock()) {
            fetchFromStorage();
            acceptPayment();
            updateStock();
            issueReceipt();
        } else {
            System.out.println("Stock is not sufficient, purchase cannot be completed.");
        }
    }

    protected abstract void receivePrescription();
    protected abstract boolean checkStock();
    protected abstract void fetchFromStorage();
    protected abstract void acceptPayment();
    protected abstract void updateStock();
    protected abstract void issueReceipt();
}
