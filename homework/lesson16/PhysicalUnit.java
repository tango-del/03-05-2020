package homework.lesson16;

public class PhysicalUnit extends Unit {
    private int strength;

    protected  PhysicalUnit() {

    }

    protected PhysicalUnit(int health, int defense, int strength) {
        super(health, defense);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    protected void move() {

    }

    @Override
    protected void stop() {

    }

    @Override
    protected void attack() {

    }
}