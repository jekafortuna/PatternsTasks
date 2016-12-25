package ua.kpi.PatternsTasks.HumanRolesUnion;

/**
 * Created by Evgeniy on 24.12.2016.
 */
public class Human {
    private Location location;
    private HumanState humanState;
    private Human nextHumanState;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setStateByLocation(){
        if (this.getLocation() == Location.BEACH_OF_RIVER){
            System.out.println(View.AT_THE_BEACH_OF_RIVER);
            this.humanState = new Fisher();
        }
        else if (this.getLocation() == Location.LAND_OF_MUSHROOMS){
            System.out.println(View.AT_THE_LAND_OF_MUSHROOMS);
            this.humanState = new Mushroomer();
        }
        else if (this.getLocation() == Location.MEET_AN_ANIMAL){
            System.out.println(View.MEET_AN_ANIMAL);
            this.humanState = new Hunter();
        }
        else {
            System.out.println(View.NO_SUCH_STATE);
        }
    }

    public void setNextState(Human location){
        nextHumanState = location;
    }

    public void changeRole(){
        humanState.changeRole();
        if (nextHumanState != null){
            nextHumanState.changeRole();
        }
    }
}
