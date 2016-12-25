package ua.kpi.PatternsTasks.HumanRolesUnion;

/**
 * Created by Evgeniy on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.setLocation(Location.LAND_OF_MUSHROOMS);
        human.setStateByLocation();
        human.changeRole();

        Human human2 = new Human();
        human2.setLocation(Location.MEET_AN_ANIMAL);
        human2.setStateByLocation();
//        human2.changeRole();

        human.setNextState(human2);
        human.changeRole();
    }
}
