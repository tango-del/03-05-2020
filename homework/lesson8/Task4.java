package homework.lesson8;

/*
Есть числовой массив.
С клавиатуры ввести его длину и значения.
Отсортировать первую половину массив по возрастанию
*/
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length:");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        fillArray(arr);
        printArray(arr);
        sortHalfArray(arr);
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
    static void sortHalfArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length / 2 - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill array numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}