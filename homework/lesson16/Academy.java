package homework.lesson16;

public class Academy {

    private Soldier createSoldier() {
        return new Soldier(randomize(), randomize(), randomize()); //fill random numbers
    }

    private Archer createArcher() {
        return new Archer(randomize(), randomize(), randomize());
    }

    private Wizard createWizard() {
        return new Wizard(randomize(), randomize(), randomize());
    }

    private Cleric createCleric() {
        return new Cleric(randomize(), randomize(), randomize());
    }

    public Soldier[] createSoldier(int count) {
        System.out.println("creating soldiers");
        Soldier[] soldiers = new Soldier[count];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = createSoldier();
        }
        return soldiers;
    }

    public Archer[] createArcher(int count) {
        System.out.println("creating archers");
        Archer[] archers = new Archer[count];
        for (int i = 0; i < archers.length; i++) {
            archers[i] = createArcher();
        }
        return archers;
    }

    public Wizard[] createWizard(int coint) {
        System.out.println("creating wizards");
        Wizard[] wizards = new Wizard[coint];
        for (int i = 0; i < wizards.length; i++) {
            wizards[i] = createWizard();
        }
        return wizards;
    }

    public Cleric[] createCleric(int count) {
        System.out.println("creating clerics");
        Cleric[] clerics = new Cleric[count];
        for (int i = 0; i < clerics.length; i++) {
            clerics[i] = createCleric();
        }
        return clerics;
    }
    private static int randomize() {
        return (int) (Math.random() * 100);
    }
}