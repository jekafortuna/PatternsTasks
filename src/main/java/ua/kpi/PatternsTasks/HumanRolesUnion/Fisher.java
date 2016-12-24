package ua.kpi.PatternsTasks.HumanRolesUnion;

/**
 * Created by Evgeniy on 24.12.2016.
 */
public class Fisher implements HumanState {
    @Override
    public void changeRole() {
        System.out.println("Now I'm a Fisher!");
    }
}
