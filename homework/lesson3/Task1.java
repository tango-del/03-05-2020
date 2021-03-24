package homework.lesson3;

/*
1. Определить какое из трех, введенных пользователем чисел максимальное и вывести его на экран(сканер).
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        numbersComparison();
        numbersComparison();
        numbersComparison();
    }
    static void numbersComparison() {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье число:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Число " + firstNumber + " максимальное");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Число " + secondNumber + " максимальное");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Число " + thirdNumber + " максимальное");
        }
    }
}