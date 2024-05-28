package Problem_4;

import java.util.HashMap;
import java.util.Map;

public class Laboratory4 {
    private Map<String, Recipe4> recipeMap = new HashMap<>();

    public void addRecipe(String name, Recipe4 recipe) {
        recipeMap.put(name, recipe);
    }

    public Recipe4 createRecipe(String name) {
        Recipe4 cachedRecipe = recipeMap.get(name);
        return cachedRecipe != null ? cachedRecipe.cloneRecipe() : null;
    }
}
