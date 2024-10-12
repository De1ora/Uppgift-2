package pack;

import java.util.ArrayList;
import java.util.List;

public class Sport {
    private List<Player> listOfPlayer;
    private String location;
    private int totalPlayer;

    public Sport(String location, int totalPlayer) {
        this.listOfPlayer = new ArrayList<>();
        this.location = location;
        this.totalPlayer = totalPlayer;
    }

    public void makeGoal() {
        System.out.println("Parent class make goal.");
    }

    public void penalty() {
        System.out.println("Parent class penalty.");
    }
}
