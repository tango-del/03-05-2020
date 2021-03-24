package homework.lesson16;

public class Archer extends PhysicalUnit {

    protected Archer() {

    }

    protected Archer(int health, int defense, int strength) {
        super(health, defense, strength);
    }

    @Override
    protected void move() {
        System.out.println("Archer start moving");
    }

    @Override
    protected void stop() {
        System.out.println("Archer stop moving");
    }

    @Override
    protected void attack() {
        System.out.println("Archer start attacking");
    }

}