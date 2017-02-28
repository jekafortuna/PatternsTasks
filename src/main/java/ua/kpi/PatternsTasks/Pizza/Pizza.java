package ua.kpi.PatternsTasks.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeniy on 01.03.2017.
 */
public class Pizza implements Component {
    private static final int PROFIT_IN_PERCENTS = 15;
    private List<Component> components;
    private String name;

    public Pizza(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    /**
     * Adding new component to pizza
     * @param component to add
     */
    public void addComponent(Component component){
        components.add(component);
    }

    /**
     * Removing existing component from pizza
     * @param component to remove
     */
    public void removeComponent(Component component){
        components.remove(component);
    }

    public void printComponents() {
        System.out.println("Pizza \'" + name + "\';");
        System.out.println("Components : ");
        for (Component component : components) {
            System.out.println("\t" + component.toString());
        }
    }

    /**
     * Counts general price of pizza's components
     * @return price
     */
    @Override
    public double getPrice() {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }

    /**
     * Counts profit from pizza
     * @return profit
     */
    public double getProfit(){
        return getPrice() * PROFIT_IN_PERCENTS / 100;
    }

    public static class Builder{
        private Pizza pizza;

        public Builder(Pizza pizza) {
            this.pizza = pizza;
        }

        public Builder addDough(Dough dough){
            pizza.addComponent(dough);
            return this;
        }

        public Builder addSauce(Sauce sauce){
            pizza.addComponent(sauce);
            return this;
        }

        public Builder addIngredient(Ingredient ingredient){
            pizza.addComponent(ingredient);
            return this;
        }

        public Pizza build(){
            return pizza;
        }
    }
}
