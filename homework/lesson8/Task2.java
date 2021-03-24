package homework.lesson8;

/*
Реализовать улучшенный алгоритм шейкерной сортировки
*/
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 8, 100, 1, -2, 0, 7, 55, 31, 3};
        shakerSortASC(numbers);
        printArray(numbers);
        System.out.printf("\n");
        shakerSortDESC(numbers);
        printArray(numbers);
    }

    static void shakerSortASC(int arr[]) {
        int temp;
        int leftSide = 0;
        int rightSide = arr.length - 1;
        int howmuch = 0;
        do {
            howmuch++;
            for (int i = leftSide; i < rightSide; i++) {
                howmuch++;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                howmuch++;
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
        System.out.println("Кол-во итераций: " + howmuch);
    }

    static void shakerSortDESC(int arr[]) {
        int temp;
        int leftSide = 0;
        int rightSide = arr.length - 1;
        int howmuch = 0;
        do {
            for (int i = leftSide; i < rightSide; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] > arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
    }

    static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("]");
    }
}