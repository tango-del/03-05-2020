package homework.lesson12;

/*
Создать классы Soldier, Archer, Mage
Каждому классу создать свойства (характеристики): Здоровье, Защита
Soldier, Archer должны обладать свойством сила, а Mage - магическая сила
Для всех классов создать методы: ходить, останавливаться, атаковать
Для класса Mage создать дополнительный метод творить магию
Создать класс Army
Классу Army создать свойства: массив Soldier, массив Archer, массив Mage
Для класса Army создать метод, который считает количество пригодных к бою всех типов воинов и выводит данные в консоль по следующему правилу: Все кроме Mage, пригодные если здоровье не менее 85, а для Mage не менее 50
Укомплектовать армию из 5 Soldier, 3 Archer, 2 Mage
Вывести в консоль информацию о пригодных к бою воинах
* Направить в атаку только тех воинов, которые пригодные к бою

 */
public class Main {

    public static void main(String[] args) {
        //task2();
        Army def = new Army();
        def.initArmySoldier();
    }

    static void task2() {
        Army hp = new Army();
        randomize(hp);
//        System.out.println("----BEFORE----");
//        printArray(hp);
        bubbleSortDESC(hp);
//        System.out.println("----AFTER----");
//        printArray(hp);
        readyAttack(hp);
    }

    static void randomize(Army hp) {
        for (int i = 0; i < hp.soldiers.length; i++) {
            hp.soldiers[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < hp.archers.length; i++) {
            hp.archers[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < hp.mages.length; i++) {
            hp.mages[i] = (int) (Math.random() * 100);
        }
    }

    static void bubbleSortDESC(Army hp) {
        for (int i = 0; i < hp.soldiers.length - 1; i++) {
            for (int j = 0; j < hp.soldiers.length - 1 - i; j++) {
                if (hp.soldiers[j] < hp.soldiers[j + 1]) {
                    int temp = hp.soldiers[j];
                    hp.soldiers[j] = hp.soldiers[j + 1];
                    hp.soldiers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < hp.archers.length - 1; i++) {
            for (int j = 0; j < hp.archers.length - 1 - i; j++) {
                if (hp.archers[j] < hp.archers[j + 1]) {
                    int temp = hp.archers[j];
                    hp.archers[j] = hp.archers[j + 1];
                    hp.archers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < hp.mages.length - 1; i++) {
            for (int j = 0; j < hp.mages.length - 1 - i; j++) {
                if (hp.mages[j] < hp.mages[j + 1]) {
                    int temp = hp.mages[j];
                    hp.mages[j] = hp.mages[j + 1];
                    hp.mages[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(Army hp) {
        for (int i = 0; i < hp.soldiers.length; i++) {
            System.out.printf("%d ", hp.soldiers[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < hp.archers.length; i++) {
            System.out.printf("%d ", hp.archers[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < hp.mages.length; i++) {
            System.out.printf("%d ", hp.mages[i]);
        }
        System.out.print("\n");
    }

    static void readyAttack(Army hp) {
        for (int i = 0; i < hp.soldiers.length; i++) {
            if (hp.soldiers[i] >= 85) {
                System.out.println(String.format("soldier %s with %s hp ready for attack", i + 1, hp.soldiers[i]));
            }
        }
        for (int i = 0; i < hp.archers.length; i++) {
            if (hp.archers[i] >= 85) {
                System.out.println(String.format("archer %s with %s hp ready for attack", i + 1, hp.archers[i]));
            }
        }
        for (int i = 0; i < hp.mages.length; i++) {
            if (hp.mages[i] >= 50) {
                System.out.println(String.format("mage %s with %s hp ready for attack", i + 1, hp.mages[i]));
            }
        }
    }
}