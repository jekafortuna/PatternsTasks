package ua.kpi.PatternsTasks.Pizza;

/**
 * Created by Evgeniy on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("NYC")
                .addDough(Dough.COTTAGE_CHEESE_DOUGH)
                .addSauce(Sauce.PEPPERCORN_SAUCE)
                .addSauce(Sauce.BBQ_SAUCE)
                .addIngredient(Ingredient.BACON)
                .addIngredient(Ingredient.MUSHROOMS)
                .addIngredient(Ingredient.CHEESE)
                .addIngredient(Ingredient.SAUSAGES)
                .addIngredient(Ingredient.TOMATOES)
                .build();

        pizza.printComponents();

        System.out.println("Price : $" + pizza.getPrice() +
                " + $" + pizza.getProfit() + "(profit) = $"
                + (pizza.getPrice() + pizza.getProfit()));
    }
}
