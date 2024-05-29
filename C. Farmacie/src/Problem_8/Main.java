package Problem_8;

public class Main {
    public static void main(String[] args) {
        MedicineComponent coldMedicine1 = new Medicine("ColdStop");
        MedicineComponent coldMedicine2 = new Medicine("ColdRelief");

        MedicineSection coldSection = new MedicineSection("Cold Medicines");
        coldSection.addComponent(coldMedicine1);
        coldSection.addComponent(coldMedicine2);

        MedicineComponent painMedicine1 = new Medicine("PainAway");
        MedicineComponent painMedicine2 = new Medicine("PainRelief");

        MedicineSection painSection = new MedicineSection("Pain Medicines");
        painSection.addComponent(painMedicine1);
        painSection.addComponent(painMedicine2);

        MedicineSection adultSection = new MedicineSection("Adults");
        adultSection.addComponent(coldSection);
        adultSection.addComponent(painSection);

        MedicineComponent antibioticMedicine = new Medicine("AntibioticPlus");

        MedicineSection antibioticSection = new MedicineSection("Antibiotics");
        antibioticSection.addComponent(antibioticMedicine);

        MedicineSection mainSection = new MedicineSection("Pharmacy Medicines");
        mainSection.addComponent(adultSection);
        mainSection.addComponent(antibioticSection);

        mainSection.showDetails();
    }
}
