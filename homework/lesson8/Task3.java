package homework.lesson8;

/*
Есть числовой массив.
С клавиатуры ввести его длину и значения.
Каждое второе значение массиве поменять местами с впереди стоящим значением
*/
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length:");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        fillArray(arr);
        printArray(arr);
        swapElements(arr);
        printArray(arr);
    }
    static void fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill array numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    static void swapElements(int[] arr) {
        int temp;
        for (int i = 1; i <= arr.length - 2; i += 3) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("]");
        System.out.print("\n");
    }
}