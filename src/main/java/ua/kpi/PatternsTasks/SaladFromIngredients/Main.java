package ua.kpi.PatternsTasks.SaladFromIngredients;

/**
 * Created by Evgeniy on 20.12.2016.
 * Create our salad. Main method
 */
public class Main {
    public static void main(String[] args) {
        IngredientsBox ingredientsBox = new IngredientsBox();
        ingredientsBox.addIngredient(Ingredient.BACON, 7)
                      .addIngredient(Ingredient.CARBAGE, 3)
                      .addIngredient(Ingredient.CUCUMBER, 10)
                      .addIngredient(Ingredient.TOMATO, 15)
                      .addIngredient(Ingredient.PARROT, 5)
                      .addIngredient(Ingredient.ONION, 8)
                      .addIngredient(Ingredient.SALAD_LEAVES, 1)
                      .addIngredient(Ingredient.CHEESE, 25)
                      .addIngredient(Ingredient.OIL, 4)
                      .addIngredient(Ingredient.PEPER, 6)
                      .addIngredient(Ingredient.SALT, 2);

        Salad salad = new Salad.Builder()
                .setIngredientsAvailable(ingredientsBox.getIngredients())
                .addIngredient(Ingredient.TOMATO)
                .addIngredient(Ingredient.CUCUMBER)
                .addIngredient(Ingredient.ONION)
                .addIngredient(Ingredient.SALAD_LEAVES)
                .addIngredient(Ingredient.SALAD_LEAVES)
                .addIngredient(Ingredient.SALT)
                .addIngredient(Ingredient.CHEESE)
                .addIngredient(Ingredient.PARSLEY)
                .build();

        ingredientsBox.setIngredients(salad.getAvailableIngredients());
        salad.showSalad();
    }
}
