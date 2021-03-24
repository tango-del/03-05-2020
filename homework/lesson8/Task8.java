package homework.lesson8;

/*
Есть массив из 5 элементов.
Проверить, может ли массив стать палиндромом после
надлежащей сортировки правой и левой его частей и
вывести подготовленный массив в консоль.
К примеру: [7, 5, 9, 8, 6, 4, 9, 6, 7, 8, 5]
станет     [9, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9]
NOTE: Палиндром - это такое число читающиеся одинаково в обоих направлениях, к примеру 1234321
*/
public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 3, 9, 6};
        sort(arr);
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
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = arr.length / 2; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}