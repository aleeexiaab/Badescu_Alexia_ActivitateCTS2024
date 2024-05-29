package Problem_2;

public class Main {
    public static void main(String[] args) {
        MedicineFactory coldFactory = FactoryProvider.getFactory(Category.RACEALA);
        Medicine coldMed = coldFactory.createMedicine("ColdStop", 15.50);

        MedicineFactory painFactory = FactoryProvider.getFactory(Category.DURERE);
        Medicine painMed = painFactory.createMedicine("PainAway", 22.75);

        MedicineFactory bodyFactory = FactoryProvider.getFactory(Category.BODY);
        Medicine bodyMed = bodyFactory.createMedicine("BodyHeal", 18.00);

        System.out.println(coldMed);
        System.out.println(painMed);
        System.out.println(bodyMed);
    }
}
