package homework.lesson15;

public class Unit {
    private int health;
    private int power;
    private int defence;

    public Unit() {

    }

    /*
    public Unit(int power, int deffence) {
        this.power = power;
        this.defence = deffence;
    }
    */

    protected void setPower(int power) {
        this.power = power;
    }

    protected void setDefence(int defence) {
        this.defence = defence;
    }

    protected int getPower() {
        return power;
    }

    protected int getDefence() {
        return defence;
    }

    protected int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected void go() {

    }

    protected void stop() {

    }
}