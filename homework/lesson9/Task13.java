package homework.lesson9;

/*
Пользователь вводит с клавиатуры произвольный текст на английском языке.
Выяснить, содержиться ли в тексте хотя бы одна цифра
*/
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        checkForNumbers();
    }
    static String inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String str = scanner.nextLine();
        return str;
    }
    static void checkForNumbers() {
        char[] arr = inputText().toCharArray();
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                System.out.println("You have number " + arr[i]);
            }
        }
    }
}