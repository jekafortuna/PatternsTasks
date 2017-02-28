package ua.kpi.PatternsTasks.Pizza;

/**
 * Created by Evgeniy on 01.03.2017.
 */
public enum Dough implements Component {
    PUFF_DOUGH(4),
    FRESH_DOUGH(1.5),
    ITALIAN(4),
    COTTAGE_CHEESE_DOUGH(5.2),
    YEAST_DOUGH(3.9);

    private double price;

    Dough(double priceOfDough) {
        this.price = priceOfDough;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dough : " + super.toString();
    }
}
