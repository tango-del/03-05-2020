package homework.lesson15;

/*
Создать классы Soldier, Archer, Mage
Каждому классу создать свойства (характеристики): Здоровье, Защита, Сила
Mage дополнительно обладает свойством магическая сила
Archer дополнительно обладает свойством силь дальнего удара
Для всех классов создать методы: ходить, останавливаться, атаковать
Для класса Soldier создать дополнительный метод - стена щитов
Для класса Mage создать дополнительный метод - творить магию
Для класса Archer создать дополнительный метод - дистанционный выстрел
Все похожие свойства и методы должны быть вынесены в родительский класс Unit
Создать класс Hospital
Обладает перегруженными методами treat, которые отдельно принимают массив Soldier или массив Archer или массив Mage и возвращают массив такого же типа
Метод treat, если у какого-либо юнита из массива здоровье менее 100, тогда отправляет его на лечение, иначе сообщает, что юнит здоров, пригоден к бою и возвращает его обратно (возвращается массив с юнитами, которые пригодны к бою)
* При установке значения свойств (кроме здоровья) обойтись без геттеров и сеттеров
 */
public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Soldier[] soldiers = new Soldier[10];
        Archer[] archers = new Archer[10];
        Mage[] mages = new Mage[10];
        Hospital moveToHospital = new Hospital();

        initArmy(soldiers, archers, mages);

        System.out.println("Soldiers sending to hospital");
        moveToHospital.treat(soldiers);
        System.out.print("\n");
        System.out.println("Archers sending to hospital");
        moveToHospital.treat(archers);
        System.out.print("\n");
        System.out.println("Mages sending to hospital");
        moveToHospital.treat(mages);
    }

    public static void initArmy(Soldier[] soldiers, Archer[] archers, Mage[] mages) {
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
            soldiers[i].setHealth((int) (Math.random() * 100));
        }
        for (int i = 0; i < archers.length; i++) {
            archers[i] = new Archer();
            archers[i].setHealth((int) (Math.random() * 100));
        }
        for (int i = 0; i < mages.length; i++) {
            mages[i] = new Mage();
            mages[i].setHealth((int) (Math.random() * 100));
        }
    }
}