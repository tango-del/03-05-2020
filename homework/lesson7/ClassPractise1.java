package homework.lesson7;

/*
В США нет 13-х этажей, а соответственно, когда строится панель
управления лифтом для указания пункта назначения, то там
должен отсутствовать данный номер. Создать здание из этажей
не более 1000, но числа 13 там представлено быть не должно.
Кол-во этажей здания вводится из консоли
Например: 1 2 3 4 5 6 7 8 9 10 11 12 0 14 15
*/
import java.util.Scanner;
public class ClassPractise1 {
    public static void main(String[] args) {
        int[] floors = generateFloors();
        printArray(floors);
    }

    static int[] generateFloors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill numbers of floor");
        int[] floors = new int[scanner.nextInt()];

        for (int i = 0, j = 1; i < floors.length; i++) {
            if (i == 12) {
                j++;
            }
            floors[i] = j++;
        }
        return floors;
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
