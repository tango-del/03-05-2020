package homework.lesson16;

import java.util.Scanner;

/*
Создать абстрактный класс Unit
Обладает состоянием (свойства\характеристики): Здоровье, Защита
Обладает абстрактным поведением (методы): ходить, останавливаться, атаковать
Создать классы Soldier, Archer, Wizard
Каждый должен наследовать состояние родителя Unit: Здоровье, Защита
Soldier, Archer должны обладать свойством “Сила”, а Wizard - “Магическая Сила”
Каждый наследует поведение родителя Unit и переопределяет его под себя: ходить, останавливаться, атаковать
Для класса Wizard создать дополнительный метод творить магию
Создать класс Cleric
Наследует поведение и состояние класса Wizard и переопределяемых их под себя
Обладает поведением “Лечить”
Создать класс Academy
Обладает поведением (методы): Создать воина, Создать лучника, Создать мага, Создать клерика
* Класс Academy должен обладать возможностью заказать подготовку юнитов в предопределенном количестве и вернуть сразу группу, вместо одного. При этом старые методы остаются, но имена старых и новых должны быть одинаковыми
* Soldier и Archer должны иметь общего родителя, который наследуем им состояние (свойства\характеристики) - “Сила”, при этом допускается использование в качестве предка (прародители, прапрародители и так далее) Unit, но он не может быть непосредственным родителем
** Класс Cleric не должен обладать поведением “Атаковать”, но при это должен обладать всем остальным состоянием и поведением класса Wizard. Допускается создание других классов и изменение их текущей структуры, без потери его текущего состояния (свойства\характеристики) и поведения (методы)
 */
public class Main {
    public static void main(String[] args) {
        init();
    }
    static void init() {
        Scanner scanner = new Scanner(System.in);
        Academy academy = new Academy();

        System.out.println("count soldiers");
        Soldier[] soldiers = academy.createSoldier(scanner.nextInt());
        printArray(soldiers);

        System.out.println("count archers");
        Archer[] archers = academy.createArcher(scanner.nextInt());
        printArray(archers);

        System.out.println("count wizards");
        Wizard[] wizards = academy.createWizard(scanner.nextInt());
        printArray(wizards);

        System.out.println("count clerics");
        Cleric[] clerics = academy.createCleric(scanner.nextInt());
        printArray(clerics);
    }
    static void printArray(Soldier[] soldiers) {
        for (int i = 0; i < soldiers.length; i++) {
            System.out.printf("soldier %s has %s health, %s defence and %s strength",
                    i + 1,
                    soldiers[i].getHealth(),
                    soldiers[i].getDefense(),
                    soldiers[i].getStrength());
            System.out.print("\n");
        }
    }
    static void printArray(Archer[] archers) {
        System.out.print("[");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("archer %s has %s health, %s defence and %s strength",
                    i + 1,
                    archers[i].getHealth(),
                    archers[i].getDefense(),
                    archers[i].getStrength());
            System.out.print("\n");
        }

    }
    static void printArray(Wizard[] wizards) {
        for (int i = 0; i < wizards.length; i++) {
            System.out.printf("wizard %s has %s health, %s defence and %s magic power",
                    i + 1,
                    wizards[i].getHealth(),
                    wizards[i].getDefense(),
                    wizards[i].getMagicPower());
            System.out.print("\n");
        }
    }
    static void printArray(Cleric[] clerics) {
        for (int i = 0; i < clerics.length; i++) {
            System.out.printf("cleric %s has %s health, %s defence and %s magic power",
                    i + 1,
                    clerics[i].getHealth(),
                    clerics[i].getDefense(),
                    clerics[i].getMagicPower());
            System.out.print("\n");
        }
    }
}