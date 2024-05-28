package Problem_8;

public class Main8 {
    public static void main(String[] args) {
        Component8 cardiology = new Leaf8("Cardiology Section");
        Component8 orthopedics = new Leaf8("Orthopedics Section");
        Component8 pediatrics = new Leaf8("Pediatrics Section");

        Composite8 mainDepartment = new Composite8("Main Hospital Department");
        Composite8 surgeryDepartment = new Composite8("Surgery Department");
        Composite8 generalDepartment = new Composite8("General Department");

        mainDepartment.add(surgeryDepartment);
        mainDepartment.add(generalDepartment);

        surgeryDepartment.add(cardiology);
        surgeryDepartment.add(orthopedics);

        generalDepartment.add(pediatrics);

        mainDepartment.display();
    }
}
