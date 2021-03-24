package homework.lesson16;

public abstract class Unit {
    private int health;
    private int defense;

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int getHealth() {
        return health;
    }

    protected int getDefense() {
        return defense;
    }

    protected void setDefense(int defense) {
        this.defense = defense;
    }

    protected Unit() {

    }

    protected Unit(int health, int defense) {
        this.health = health;
        this.defense = defense;
    }

    protected abstract void move();
    protected abstract void stop();
    protected abstract void attack();
}