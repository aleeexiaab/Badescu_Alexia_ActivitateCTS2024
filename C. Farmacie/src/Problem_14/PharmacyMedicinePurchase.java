package Problem_14;

public class PharmacyMedicinePurchase extends MedicinePurchaseTemplate{
    @Override
    protected void receivePrescription() {
        System.out.println("Prescription received.");
    }

    @Override
    protected boolean checkStock() {
        System.out.println("Checking stock in system.");
        return true; // Assuming stock is sufficient for this example
    }

    @Override
    protected void fetchFromStorage() {
        System.out.println("Fetching medicines from storage.");
    }

    @Override
    protected void acceptPayment() {
        System.out.println("Accepting payment from customer.");
    }

    @Override
    protected void updateStock() {
        System.out.println("Updating stock in system.");
    }

    @Override
    protected void issueReceipt() {
        System.out.println("Issuing receipt to customer.");
    }
}
