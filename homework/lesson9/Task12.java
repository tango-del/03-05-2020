package homework.lesson9;

/*
Пользователь вводит с клавиатуры произвольный текст
(не более 5 символов) на английском языке.
Необходимо вычислить сумму числового представлениях всех вместе взятых символов
*/
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        calcValue();
    }
    static void calcValue(){
        char[] arr = inputText().toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    static String inputText(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int maxCharacters = 5;
        boolean checkLength;
        do {
            System.out.println("Input text no more than 5 characters: ");
            str = scanner.nextLine();
            checkLength = str.length() > maxCharacters;
            if (checkLength) {
                System.out.println("Your text have more than 5 characters. Try again:");
            }
        } while (checkLength);
        return str;
    }
}