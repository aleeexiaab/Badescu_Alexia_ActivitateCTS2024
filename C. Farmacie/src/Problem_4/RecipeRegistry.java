package Problem_4;

import java.util.HashMap;
import java.util.Map;

public class RecipeRegistry {
    private Map<String, Recipe> recipes = new HashMap<>();

    public void addRecipe(String key, Recipe recipe) {
        recipes.put(key, recipe);
    }

    public Recipe getRecipe(String key) {
        Recipe recipe = recipes.get(key);
        return recipe != null ? recipe.clone() : null;
    }
}
