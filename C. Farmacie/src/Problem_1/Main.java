package Problem_1;

public class Main {
    public static void main(String[] args) {
        Medicine coldMed = MedicineFactory.createMedicine(Category.RACEALA, "ColdStop", 15.50);
        Medicine painMed = MedicineFactory.createMedicine(Category.DURERE, "PainAway", 22.75);
        Medicine bodyMed = MedicineFactory.createMedicine(Category.BODY, "BodyHeal", 18.00);

        System.out.println(coldMed);
        System.out.println(painMed);
        System.out.println(bodyMed);
    }
}
