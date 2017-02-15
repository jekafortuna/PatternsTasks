package ua.kpi.PatternsTasks.CarBuilder;

/**
 * Created by Evgeniy on 15.02.2017.
 */
public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct(){
        return builder.setWheels(4).setColor("Red").build();
    }

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
}
