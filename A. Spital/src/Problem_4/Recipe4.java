package Problem_4;

public class Recipe4 implements CloneableRecipe4{
    private String name;
    private int solutionQuantity;

    public Recipe4(String name, int solutionQuantity) {
        this.name = name;
        this.solutionQuantity = solutionQuantity;
    }

    public String getName() {
        return name;
    }

    public int getSolutionQuantity() {
        return solutionQuantity;
    }

    @Override
    public Recipe4 cloneRecipe() {
        return new Recipe4(name, solutionQuantity);
    }

    @Override
    public String toString() {
        return "Recipe{name='" + name + "', solutionQuantity=" + solutionQuantity + '}';
    }
}
