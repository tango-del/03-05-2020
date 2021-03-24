package homework.lesson2;

import java.util.Scanner;

/*
1. Написать метод, который сначала спрашивает(через сканер) число которое нужно возвести в степень, затем степень. Далее возводит в степень и выводит в консоль(Math.pow()).
 */
public class Task1 {
    public static void main(String[] args) {
        iHaveNoIdeaWhatIamDoing();
    }
    static double degreeNumber(double number, double degree) {
        return Math.pow(number, degree);
    }
    static void iHaveNoIdeaWhatIamDoing() {
        System.out.println("Введите число для возведения в степень:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Введите степень");
        int degree = scan.nextInt();
        double numberDegree = degreeNumber(number, degree);
        System.out.println("Число " + number + " в степени " + degree + " равняется: " +numberDegree);
    }
}
