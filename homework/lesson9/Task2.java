package homework.lesson9;


/*
Написать конвертор из числа в символ из таблицы ASCII
Если пользователь вводит неверное значение, то уведомить его ошибкой в консоль
0 - 127
*/
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        converter();
    }
    static void converter() {
        String cont = "Y";
        Scanner scanner = new Scanner(System.in);
        do {
            boolean checkNumber;
            int inputValue;
            do {
                System.out.println("Enter number from 0 up to 127");
                inputValue = scanner.nextInt();
                checkNumber = inputValue < 0 || inputValue > 127;
            }while (checkNumber);
            char abc = (char) inputValue;
            System.out.println("Number: " + inputValue + " in ASCII is: " + abc);
            System.out.println("Want to continue? Y or N: ");
            cont = scanner.next().toUpperCase();
        }while (cont.equals("Y"));
    }
}