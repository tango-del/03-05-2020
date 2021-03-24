package homework.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        chuckNorrisDelivery();
    }
    static double speed(double distance, double time) {
        return distance / time;
    }
    static void chuckNorrisDelivery() {
        //Пройденное расстояние
        System.out.println("Сколько километров машина ехала на Чаке Норрисе что бы добраться до шиномонтажа:");
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();
        //Сколько времени заняла дорога
        System.out.println("Сколько времени ему потребовалось на это:");
        double time = scan.nextDouble();
        double speed = speed(distance, time);
        System.out.println("Cредняя скорость " + speed);
    }
}
/*
Написать метод, который спрашивает через сканер пройденное растояние в километрах автомобилем,
затем спрашивает сколько часов заняла дорога, а потом выводит среднюю скорость в консоль.
Использовать тип double.
 */