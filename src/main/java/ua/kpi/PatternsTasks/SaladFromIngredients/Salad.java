package ua.kpi.PatternsTasks.SaladFromIngredients;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Evgeniy on 20.12.2016.
 * This class allows us to add and remove ingredients from salad
 */
public class Salad implements SaladActions{
    /**
     * Ingredients ready for making salad
     */
    private Map<Ingredient, Integer> availableIngredients;

    /**
     * List of ingredients our salad was made from
     */
    private List<Ingredient> salad = new ArrayList<>();

    public Salad() {}

    public Salad(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        if (isAvailable(ingredient)){
            salad.add(ingredient);
            availableIngredients.put(ingredient, availableIngredients.get(ingredient) - 1);
        } else {
            System.out.println(View.NO_MORE_INGREDIENTS + ingredient.toString());
        }
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        if (isAvailable(ingredient)){
            salad.remove(ingredient);
            availableIngredients.remove(ingredient, availableIngredients.get(ingredient) + 1);
        }
    }

    @Override
    public boolean isAvailable(Ingredient ingredient) {
        return (availableIngredients.containsKey(ingredient) &&
                availableIngredients.get(ingredient) > 0);
    }

    @Override
    public void showSalad() {
        System.out.println(View.INGREDIENTS);
        salad.forEach(elem -> System.out.println("\t" + elem));
    }

    @Override
    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }

    /**
     * Class Builder of Builder pattern
     */
    public static class Builder{
        Salad salad = new Salad();

        public Builder setIngredientsAvailable(
                Map<Ingredient, Integer> ingredientsAvailable) {
            salad.setAvailableIngredients(ingredientsAvailable);
            return this;
        }

        public Builder addIngredient(Ingredient ingredient) {
            salad.addIngredient(ingredient);
            return this;
        }

        public Builder removeIngredient(Ingredient ingredient) {
            salad.removeIngredient(ingredient);
            return this;
        }

        public Salad build() {
            return salad;
        }
    }
}
