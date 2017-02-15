package ua.kpi.PatternsTasks.CarBuilder;

/**
 * Created by Evgeniy on 15.02.2017.
 */
public interface CarBuilder {
    CarBuilder setWheels(int wheels);

    CarBuilder setColor(String color);

    Car build();
}
