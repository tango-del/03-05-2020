package homework.lesson3;

import java.util.Scanner;

/*
3.Вводится цена товара. Если цена от 0 до 100 - вывести на экран что скидка по товару 0 %.

Если от 101 до 200 - вывести конечную стоимость товара со скидкой 2%. Если от 201 и больше - вывести конечную стоимость товара со скидкой 5 %.(сканер)
 */
public class Task3 {
    public static void main(String[] args) {
        costCalc();
        costCalc();
        costCalc();
    }

    static void costCalc() {
        System.out.println("Введите цену товара: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if (price >= 0 && price <= 100) {
            System.out.println("Скидка будет 0 %");
        } else if (price >= 101 && price <= 200) {
            System.out.println("Стоимость товара со скидкой 2 % будет: " + (price - ((price * 2) / 100)));
        } else if (price >= 201) {
            System.out.println("Стоимость товара со скидкой 5 % будет: " + (price - ((price * 5) / 100)));
        }
    }
}