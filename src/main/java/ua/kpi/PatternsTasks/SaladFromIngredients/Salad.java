package ua.kpi.PatternsTasks.SaladFromIngredients;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Evgeniy on 20.12.2016.
 */
public class Salad implements SaladActions{
    private Map<Ingredient, Integer> availableIngredients;
    private List<Ingredient> salad = new ArrayList<>();

    public Salad() {
    }

    public Salad(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {

    }

    @Override
    public void removeIngredient(Ingredient ingredient) {

    }

    @Override
    public boolean isAvailable(Ingredient ingredient) {
        return false;
    }

    @Override
    public void createSalad() {

    }

    @Override
    public Map<Ingredient, Integer> getAvailableIngredients() {
        return null;
    }

    public static class Builder{
        Salad salad = new Salad();

        public Salad build() {
            return salad;
        }
    }
}
