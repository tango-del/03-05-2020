package homework.lesson16;

public class Soldier extends PhysicalUnit {

    protected Soldier() {

    }

    protected Soldier(int health, int defense, int strength) {
        super(health, defense, strength);

    }

    @Override
    protected void move() {
        System.out.println("Soldier start moving");
    }

    @Override
    protected void stop() {
        System.out.println("Soldier stop moving");
    }

    @Override
    protected void attack() {
        System.out.println("Soldier start attacking");
    }
}