package homework.lesson15;

public class Hospital {
    Army army = new Army();

    public Soldier[] treat(Soldier[] soldier) {
        healSoldiers(soldier);
        return soldier;
    }

    public Archer[] treat(Archer[] archer) {
        healArchers(archer);
        return archer;
    }

    public Mage[] treat(Mage[] mage) {
        healMages(mage);
        return mage;
    }

    private void healSoldiers(Soldier[] soldier) {
        int indexValue = 0;
        descSort(soldier);
        System.out.println("----oldArray----");
        printArray(soldier);
        for (int i = 0; i < soldier.length; i++) {
            if (soldier[i].getHealth() >= 65) {
                indexValue++;
            }
        }
        Soldier[] copied = new Soldier[indexValue];
        copyArray(copied, soldier);
        System.out.println("-----newArray----");
        printArray(copied);
        army.camp(copied);
    }

    private void printArray(Soldier[] soldier) {
        for (int i = 0; i < soldier.length; i++) {
            System.out.printf("%d ", soldier[i].getHealth());
        }
        System.out.print("\n");
    }

    private void descSort(Soldier[] soldier) {
        for (int i = 0; i < soldier.length - 1; i++) {
            for (int j = 0; j < soldier.length - 1 - i; j++) {
                if (soldier[j].getHealth() < soldier[j + 1].getHealth()) {
                    int temp = soldier[j].getHealth();
                    soldier[j].setHealth(soldier[j + 1].getHealth());
                    soldier[j + 1].setHealth(temp);
                }
            }
        }
    }

    private void copyArray(Soldier[] copied, Soldier[] soldier) {
        for (int i = 0; i < copied.length; i++) {
            copied[i] = soldier[i];
        }
    }

    private void healArchers(Archer[] archers) {
        int indexValue = 0;
        System.out.println("----oldArray----");
        //printArray(archers);
        descSort(archers);
        printArray(archers);
        for (int i = 0; i < archers.length; i++) {
            if (archers[i].getHealth() >= 65) {
                indexValue++;
            }
        }
        Archer[] copied = new Archer[indexValue];
        copyArray(copied, archers);
        System.out.println("-----newArray----");
        printArray(copied);
        army.camp(copied);
    }

    private void copyArray(Archer[] copied, Archer[] archers) {
        for (int i = 0; i < copied.length; i++) {
            copied[i] = archers[i];
        }
    }

    private void printArray(Archer[] archers) {
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("%d ", archers[i].getHealth());
        }
        System.out.print("\n");
    }

    private void descSort(Archer[] archer) {
        for (int i = 0; i < archer.length - 1; i++) {
            for (int j = 0; j < archer.length - 1 - i; j++) {
                if (archer[j].getHealth() < archer[j + 1].getHealth()) {
                    int temp = archer[j].getHealth();
                    archer[j].setHealth(archer[j + 1].getHealth());
                    archer[j + 1].setHealth(temp);
                }
            }
        }
    }

    private void healMages(Mage[] mage) {
        int indexValue = 0;
        System.out.println("----oldArray----");
        descSort(mage);
        printArray(mage);
        for (int i = 0; i < mage.length; i++) {
            if (mage[i].getHealth() >= 65) {
                indexValue++;
            }
        }
        Mage[] copied = new Mage[indexValue];
        copyArray(copied, mage);
        System.out.println("-----newArray----");
        printArray(copied);
        army.camp(copied);
    }

    private void descSort(Mage[] mage) {
        for (int i = 0; i < mage.length - 1; i++) {
            for (int j = 0; j < mage.length - 1 - i; j++) {
                if (mage[j].getHealth() < mage[j + 1].getHealth()) {
                    int temp = mage[j].getHealth();
                    mage[j].setHealth(mage[j + 1].getHealth());
                    mage[j + 1].setHealth(temp);
                }
            }
        }
    }

    private void copyArray(Mage[] copied, Mage[] mages) {
        for (int i = 0; i < copied.length; i++) {
            copied[i] = mages[i];
        }
    }

    private void printArray(Mage[] mage) {
        for (int i = 0; i < mage.length; i++) {
            System.out.printf("%d ", mage[i].getHealth());
        }
        System.out.print("\n");
    }

    private int randomPower() {
        return (int) (Math.random() * 100);
    }

    private int randomDeffence() {
        return (int) (Math.random() * 100);
    }

    private int randomRangePower() {
        return (int) (Math.random() * 100);
    }

    private int randomMagicPower() {
        return (int) (Math.random() * 100);
    }
    /*
    ----function with copy characters in new Array----
    private void healSoldiers(Soldier[] soldier) {
        System.out.println("----oldArray----");
        for (int i = 0; i < soldier.length; i++) {
            System.out.printf("%d ", soldier[i].getHealth());
        }
        System.out.print("\n");
        int indexValue = 0;
        Soldier[] copied = new Soldier[indexValue];
        for (int i = 0; i < soldier.length; i++) {
            if (soldier[i].getHealth() >= 65) {
                indexValue++;
                for (int k = 0; i < copied.length; k++) {
                    //copied[k] = new Soldier(randomPower(), randomDeffence());
                    copied[k] = new Soldier();
                }
                Soldier[] temp = new Soldier[indexValue];
                for (int j = 0; j < temp.length; j++) {
                    //temp[j] = new Soldier(randomPower(), randomDeffence());
                    temp[j] = new Soldier();
                }
                temp[indexValue - 1].setHealth(soldier[i].getHealth());
                copyArray(copied, temp);
                copied = temp;
            }
        }
        System.out.println("-----newArray----");
        for (int i = 0; i < copied.length; i++) {
            System.out.printf("%d ", copied[i].getHealth());
        }
        System.out.print("\n");
        army.attackSoldiers(copied);
    }
    */
}