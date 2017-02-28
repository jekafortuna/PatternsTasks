package ua.kpi.PatternsTasks.Pizza;

/**
 * Created by Evgeniy on 28.02.2017.
 */
public enum Ingredient implements Component{
    CHEESE(6),
    PINEAPPLE(2.9),
    TOMATOES(4.7),
    BACON(6.8),
    PEPPER(2.6),
    SALAD(0.8),
    SAUSAGES(3),
    MUSHROOMS(3.18);

    private double price;

    Ingredient(double priceOfIngredient) {
        this.price = priceOfIngredient;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ingredient : " + super.toString();
    }
}
