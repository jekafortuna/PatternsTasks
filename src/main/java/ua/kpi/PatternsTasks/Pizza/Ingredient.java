package ua.kpi.PatternsTasks.Pizza;

/**
 * Created by Evgeniy on 28.02.2017.
 */
public enum Ingredient implements Component{
    ;

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
