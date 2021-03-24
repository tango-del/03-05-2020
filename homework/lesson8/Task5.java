package homework.lesson8;

/*
Пользователь вводит с клавиатуры натуральное число, состоящие не менее чем из 2 цифр.
Получить новое число, цифры которого будет расположены по убыванию.
К примеру: 80124 будет 84210 и вывести в консоль
*/
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        int inputNumber = 0;
        int number = checkNumber(inputNumber);
        int lengthNumber = Integer.toString(number).length();
        int[] arr = new int[lengthNumber];
        fillArray(arr, number);
        sortArray(arr);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("]");
        System.out.print("\n");
    }
    static int checkNumber(int inputNumber) {
        boolean checkInputNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter natural number consisting of at least 2 digits: ");
            inputNumber = scanner.nextInt();
            checkInputNumber = inputNumber < 10;
            if (checkInputNumber) {
                System.out.println("Wrong number. Try again:");
            }
        } while (checkInputNumber);
        return inputNumber;
    }
    static void fillArray(int[] arr, int number) {
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
    }
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}