package homework.lesson9;

/*
Реализовать программу конвертации римских чисел в арабские
I, IV, V, IX, X,  XL, L,  XC, C,   CD,  D,   CM,  M
1, 4,  5, 9,  10, 40, 50, 90, 100, 400, 500, 900, 1000
2500 = 2500 - 1000 (-M)
1500 = 1500 - 1000 (-M)
500 = 500 - 500 (-D)
*/
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        convertToArabic();
    }

    static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number more then 0:");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Number is less then 1");
        }
        System.out.println("You enter: " + number);
        return number;
    }

    static void convertToArabic() {
        int number = inputNumber();
        String arrabicNumber = "";
        while (number >= 1000) {
            number -= 1000;
            arrabicNumber += "M";
        }
        while (number >= 900) {
            number -= 900;
            arrabicNumber += "CM";
        }
        while (number >= 500) {
            number -= 500;
            arrabicNumber += "D";
        }
        while (number >= 400) {
            number -= 400;
            arrabicNumber += "CD";
        }
        while (number >= 100) {
            number -= 100;
            arrabicNumber += "C";
        }
        while (number >= 90) {
            number -= 90;
            arrabicNumber += "XC";
        }
        while (number >= 50) {
            number -= 50;
            arrabicNumber += "L";
        }
        while (number >= 40) {
            number -= 40;
            arrabicNumber += "XL";
        }
        while (number >= 10) {
            number -= 10;
            arrabicNumber += "X";
        }
        while (number >= 9) {
            number -= 9;
            arrabicNumber += "IX";
        }
        while (number >= 5) {
            number -= 5;
            arrabicNumber += "V";
        }
        while (number >= 4) {
            number -= 4;
            arrabicNumber += "IV";
        }
        while (number >= 1) {
            number -= 1;
            arrabicNumber += "I";
        }
        System.out.println("Converted in Arabic: " + arrabicNumber);
    }
}