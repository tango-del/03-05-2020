package homework.lesson4;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*Даны натуральные числа от 20 до 50.
Напечатать те из них, которые делятся на 3, но не делятся на 5.
*/