package homework.lesson16;

public class Wizard extends Unit {
    private int magicPower;

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    protected Wizard() {

    }

    protected Wizard(int health, int defense, int magicPower) {
        super(health, defense);
        this.magicPower = magicPower;
    }

    @Override
    protected void move() {
        System.out.println("Wizard start moving");
    }

    @Override
    protected void stop() {
        System.out.println("Wizard stop moving");
    }

    @Override
    protected void attack() {
        System.out.println("Wizard start attacking");
    }

    protected void createMagic() {
        System.out.println("Wizard creating magic");
    }
}