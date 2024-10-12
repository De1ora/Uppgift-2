package pack;

public class Footboll extends Sport  {

    String foot;

    public Footboll(String loction, int totalPlayer, String foot) {
        super(loction, totalPlayer);
        this.foot = foot;
        
    }

    @Override
    public void addPoint() {
        super.makeGoal();
        super.penalty();
        
    }

    

}
