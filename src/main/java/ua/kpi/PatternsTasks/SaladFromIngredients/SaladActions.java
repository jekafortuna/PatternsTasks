package ua.kpi.PatternsTasks.SaladFromIngredients;

import java.util.Map;

/**
 * Created by Evgeniy on 20.12.2016.
 * Possible actions, that we can do with ingredients in salad
 */
public interface SaladActions {
    void addIngredient(Ingredient ingredient);
    void removeIngredient(Ingredient ingredient);
    boolean isAvailable(Ingredient ingredient);
    void showSalad();

    Map<Ingredient, Integer> getAvailableIngredients();
}
