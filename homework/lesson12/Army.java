package homework.lesson12;

public class Army {

    int[] soldiers = new int[15];
    int[] archers = new int[15];
    int[] mages = new int[15];
    Soldier[] soldier = new Soldier[5];
    Archer[] archer = new Archer[3];
    Mage[] mage = new Mage[2];

    void initArmySoldier() {
        initArmy(soldier, archer, mage);
        readyArmy();
    }

    void initArmy(Soldier[] soldier, Archer[] archer, Mage[] mage) {
        for (int i = 0; i < soldier.length; i++) {
            soldier[i] = new Soldier();
            soldier[i].health = (int) (Math.random() * 100);
            soldier[i].strength = (int) (Math.random() * 100);
            soldier[i].armor = (int) (Math.random() * 100);
        }
        for (int i = 0; i < archer.length; i++) {
            archer[i] = new Archer();
            archer[i].health = (int) (Math.random() * 100);
            archer[i].strength = (int) (Math.random() * 100);
            archer[i].armor = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mage.length; i++) {
            mage[i] = new Mage();
            mage[i].health = (int) (Math.random() * 100);
            mage[i].magic = (int) (Math.random() * 100);
            mage[i].armor = (int) (Math.random() * 100);
        }
    }

    void readyArmy() {
        for (int i = 0; i < soldier.length; i++) {
            if (soldier[i].health >= 80 && soldier[i].armor >= 50) {
                System.out.println(String.format("Soldier №%s with %s hp %s armor and %s strength are ready for attack!",
                        i + 1,
                        soldier[i].health,
                        soldier[i].armor,
                        soldier[i].strength)
                );
                soldier[i].attack();
            }
        }
        for (int i = 0; i < archer.length; i++) {
            if (archer[i].health >= 80 || archer[i].armor >= 50) {
                System.out.println(String.format("Archer №%s with %s hp %s armor and %s strength are ready to shoot",
                        i + 1,
                        archer[i].health,
                        archer[i].armor,
                        archer[i].strength)
                );
                archer[i].attack();
            }
        }
        for (int i = 0; i < mage.length; i++) {
            if (mage[i].health >= 50 || mage[i].armor >= 30) {
                System.out.println(String.format("Mage №%s with %s hp %s armor and %s magic strength are ready to fireblast enemies",
                        i + 1,
                        mage[i].health,
                        mage[i].armor,
                        mage[i].magic)
                );
            }
            mage[i].attack();
        }
    }
}