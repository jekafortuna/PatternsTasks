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
            System.out.println("We are at the beach of river! ");
            this.humanState = new Fisher();
        }
        else if (this.getLocation() == Location.LAND_OF_MUSHROOMS){
            System.out.println("We are at the land of mushrooms! ");
            this.humanState = new Mushroomer();
        }
        else if (this.getLocation() == Location.MEET_AN_ANIMAL){
            System.out.println("We meet an animal! Be careful! ");
            this.humanState = new Hunter();
        }
        else {
            System.out.println("No such state!!! ");
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
