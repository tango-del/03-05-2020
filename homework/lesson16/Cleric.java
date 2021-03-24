package homework.lesson16;

public class Cleric extends Wizard {

    protected Cleric() {

    }

    protected Cleric(int health, int defense, int magicPower) {
        super(health, defense, magicPower);
    }

    @Override
    protected void move() {
        System.out.println("Cleric start moving");
    }

    @Override
    protected void stop() {
        System.out.println("Cleric stop moving");
    }

    @Override
    protected void createMagic() {
        System.out.println("Cleric creating magic");
    }

    protected void healing() {
        System.out.println("Cleric healing");
    }

}