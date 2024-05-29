package Problem_4;

public class Main {
    public static void main(String[] args) {
        RecipeRegistry registry = new RecipeRegistry();

        MedicineRecipe coldRecipe = new MedicineRecipe("ColdRelief");
        coldRecipe.addIngredient("Solution A", 100);
        coldRecipe.addIngredient("Solution B", 200);

        registry.addRecipe("ColdRelief", coldRecipe);

        MedicineRecipe clonedRecipe = (MedicineRecipe) registry.getRecipe("ColdRelief");

        System.out.println(coldRecipe);
        System.out.println(clonedRecipe);
    }
}
