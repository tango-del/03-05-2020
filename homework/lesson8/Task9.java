package homework.lesson8;

/*
Алгоритм сортировки вставками
*/
public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 100, 1, -2, 0, 7, 55, 31, 3};
        System.out.println("Before:");
        printArray(arr);
        System.out.println("Insert Sort Ascending:");
        insertSortASC(arr);
        printArray(arr);
        System.out.println("Insert Sort Descending:");
        insertSortDESC(arr);
        printArray(arr);
    }

    static void insertSortASC(int[] arr) {
        int temp, j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    static void insertSortDESC(int[] arr) {
        int temp, j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] < temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
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