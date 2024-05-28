package Problem_7;

public class Patient7 {
    private String name;
    private ResultDeliveryStrategy7 deliveryStrategy;

    public Patient7(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeliveryStrategy(ResultDeliveryStrategy7 deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliverResults() {
        if (deliveryStrategy != null) {
            deliveryStrategy.deliverResults(this);
        } else {
            System.out.println("Delivery strategy not set for patient " + name);
        }
    }
}
