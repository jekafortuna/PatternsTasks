package ua.kpi.PatternsTasks.Pizza;

/**
 * Created by Evgeniy on 28.02.2017.
 */
public enum Sauce implements Component {
    SICILIAN_PIZZA_SAUCE(0.8),
    EXQUISITE_SAUCE(0.2),
    MARINARA_SAUCE(0.14),
    SATZIBELI(0.25),
    ROMESCO_SAUCE(0.45),
    SALSA(0.24),
    BBQ_SAUCE(0.71),
    RAINBOW_SAUCE(0.05),
    PEPPERCORN_SAUCE(0.3),
    MUSHROOM_KETCHUP(0.64),
    STEAK_SAUCE(0.12);

    private double price;

    Sauce(double priceOfSauce) {
        this.price = priceOfSauce;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sauce : " + super.toString();
    }
}
