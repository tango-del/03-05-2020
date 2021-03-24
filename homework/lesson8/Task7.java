package homework.lesson8;

/*
Планируется внеочередной полет на неизведанную планету для ее колонизации.
Представлено двадцать кандидатов для пилотирования шаттлом
но надо отобрать только пять.
Известен коэффициент выживаемость в непредвиденных условиях (от 1 до 100)
для каждого из кандидатов.
Принято решение укомплектовать шаттл из 5 пилотов
с наибольшим коэффициентом и при этом коэффициент должен быть кратен
*/
public class Task7 {
    public static void main(String[] args) {
        int[] pilots = new int[20];
        initPilots(pilots);
        sortPilots(pilots);
        printArray(pilots);
        searchHighRate(pilots);
        System.out.println("And we got Power Rangers!");
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("]");
        System.out.print("\n");
    }

    static void initPilots(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    static void sortPilots(int[] arr) {
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

    static void searchHighRate(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Pilot with rate: " + arr[i]);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
    }
}