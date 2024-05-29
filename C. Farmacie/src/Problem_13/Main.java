package Problem_13;

public class Main {
    public static void main(String[] args) {
        PrescriptionContext prescription = new PrescriptionContext();

        System.out.println("Current State: " + prescription.getStateName());
        prescription.request();
        System.out.println("Current State: " + prescription.getStateName());
        prescription.request();
        System.out.println("Current State: " + prescription.getStateName());
        prescription.request();
        System.out.println("Current State: " + prescription.getStateName());
    }
}
