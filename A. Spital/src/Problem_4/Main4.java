package Problem_4;

public class Main4 {
    public static void main(String[] args) {
        Laboratory4 laboratory = new Laboratory4();

        Recipe4 recipe1 = new Recipe4("Painkiller", 50);
        laboratory.addRecipe("Painkiller", recipe1);

        Recipe4 clonedRecipe = laboratory.createRecipe("Painkiller");

        System.out.println("Original Recipe: " + recipe1);
        System.out.println("Cloned Recipe: " + clonedRecipe);
    }
}
