package homework.lesson8;

/*
Реализовать улучшенный алгоритм пузырьковой сортировки
*/
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Before:");
        printArray(arr);
        System.out.println("Bubble Sort Ascending:");
        bubbleSortASC(arr);
        printArray(arr);
        System.out.println("Bubble Sort Descending:");
        bubbleSortDESC(arr);
        printArray(arr);
    }

    static void bubbleSortDESC(int[] arr) {
        //DESC From end to start
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

    static void bubbleSortASC(int[] arr) {
        //ASC From start to end
        int a = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            a++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                a++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Number of iterations: " + a);
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