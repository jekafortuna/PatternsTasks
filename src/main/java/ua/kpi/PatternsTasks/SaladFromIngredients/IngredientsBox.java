package ua.kpi.PatternsTasks.SaladFromIngredients;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeniy on 20.12.2016.
 * Storage of ingredients
 */
public class IngredientsBox {
    /**
     * Map of ingredients ready for making salad
     */
    private Map<Ingredient, Integer> ingredients;

    public IngredientsBox() {
        this.ingredients = new HashMap<>();
    }

    /**
     * Add possible ingredients to salad
     * @param ingredient type of ingredient
     * @param quantity of ingredients of this type
     * @return map
     */
    public IngredientsBox addIngredient(Ingredient ingredient, int quantity){
        ingredients.put(ingredient,quantity);
        return this;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
