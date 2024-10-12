package pack;

public class Hockey extends Sport {
    private String cloth;
    private String shoe;

    public Hockey(String cloth, String shoe, String location, int totalPlayer) {
        super(location, totalPlayer);
        this.cloth = cloth;
        this.shoe = shoe;
    }

    @Override
    public void penalty() {
        System.out.println("hockey penalty.");
    }

    @Override
    public void makeGoal() {
        System.out.println("hockey make goal.");
        super.makeGoal();
        super.penalty();
    }
}
