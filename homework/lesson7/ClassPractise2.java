package homework.lesson7;

/*
Есть число из 5 цифр в виде числа, введенное из консоли.
Если менее или более 5 цифр, то выводим ошибку и просим ввести
значение еще раз. Разобрать на отдельные числа и заполнить
массив данными числами, в таком порядке как они представлены
в строке. 12345 должна превратиться {1, 2, 3, 4, 5}
*/
import java.util.Scanner;
public class ClassPractise2 {
    public static void main(String[] args) {
        int anyNumber;
        boolean isInValidNumber;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Fill any number from 10_000 up to 99_999");
            anyNumber = scanner.nextInt();

            isInValidNumber = anyNumber < 10_000 || anyNumber >= 100_000;

            if (isInValidNumber) {
                System.out.println("Incorrect value. Try again");
            }
        } while (isInValidNumber);

        int[] number = new int[5];
        for (int i = number.length - 1; i >= 0; i--) {
            number[i] = anyNumber % 10;
            anyNumber /= 10;
        }
        printArray(number);
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
