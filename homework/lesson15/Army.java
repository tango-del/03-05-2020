package homework.lesson15;

public class Army {
    public void camp(Soldier[] soldiers) {
        randomStats(soldiers);
        attackSoldiers(soldiers);
    }

    public void camp(Archer[] archers) {
        randomStats(archers);
        attackArchers(archers);
    }

    public void camp(Mage[] mages) {
        randomStats(mages);
        attackMages(mages);
    }

    private void attackSoldiers(Soldier[] soldiers) {
        System.out.println("Soldiers compiled and ready to attack");
        for (int i = 0; i < soldiers.length; i++) {
            System.out.println(String.format("Soldier №%s with %s hp %s power and %s defence", i + 1, soldiers[i].getHealth(), soldiers[i].getPower(), soldiers[i].getDefence()));
        }
    }

    private void attackArchers(Archer[] archers) {
        System.out.println("Archers compiled and ready to attack");
        for (int i = 0; i < archers.length; i++) {
            System.out.println(String.format("Archer №%s with %s hp %s power %s defense and %s range power", i + 1, archers[i].getHealth(), archers[i].getPower(), archers[i].getDefence(), archers[i].getRangePower()));
        }
    }

    private void attackMages(Mage[] mages) {
        System.out.println("Mages compiled and ready to attack");
        for (int i = 0; i < mages.length; i++) {
            System.out.println(String.format("Mage №%s with %s hp %s power %s defence and %s magic power", i +1, mages[i].getHealth(), mages[i].getPower(), mages[i].getDefence(), mages[i].getMagicPower()));
        }
    }

    private void randomStats(Soldier[] soldiers) {
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i].setPower((int) (Math.random() * 100));
            soldiers[i].setDefence((int) (Math.random() * 100));
        }
    }

    private void randomStats(Archer[] archers) {
        for (int i = 0; i < archers.length; i++) {
            archers[i].setPower((int) (Math.random() * 100));
            archers[i].setDefence((int) (Math.random() * 100));
            archers[i].setRangePower((int) (Math.random() * 100));
        }
    }

    private void randomStats(Mage[] mages) {
        for (int i = 0; i < mages.length; i++) {
            mages[i].setPower((int) (Math.random() * 100));
            mages[i].setDefence((int) (Math.random() * 100));
            mages[i].setMagicPower((int) (Math.random() * 100));
        }
    }
}