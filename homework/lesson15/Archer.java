package homework.lesson15;

public class Archer extends Unit {
    private int rangePower;

    public Archer() {

    }

    public void setRangePower(int rangePower) {
        this.rangePower = rangePower;
    }

    /*
    public Archer(int power, int defence, int rangePower) {
        super(power, defence);
        this.rangePower = rangePower;
    }
    */

    public int getRangePower() {
        return rangePower;
    }

    public void rangeShoot() {

    }
}