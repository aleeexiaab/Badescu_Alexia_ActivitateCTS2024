package Problem_4;

import java.util.HashMap;
import java.util.Map;

public abstract class Recipe implements Cloneable{
    protected String name;
    protected Map<String, Double> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public void addIngredient(String ingredient, double quantity) {
        ingredients.put(ingredient, quantity);
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getIngredients() {
        return ingredients;
    }

    @Override
    public Recipe clone() {
        try {
            Recipe clone = (Recipe) super.clone();
            clone.ingredients = new HashMap<>(this.ingredients);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Recipe{name='" + name + "', ingredients=" + ingredients + '}';
    }
}
