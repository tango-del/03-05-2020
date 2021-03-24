package homework.lesson9;

/*
Пользователь вводит с клавиатуры произвольное слово.
Программа, после получения слова в работу, должна поменять символы правой и левой части местами.
К примеру, “Automoto” будет “otomotuA”
*/
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        reverse();
    }
    static String inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String str = scanner.nextLine();
        return str;
    }
    static void reverse() {
        char[] arr = inputText().toCharArray();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}