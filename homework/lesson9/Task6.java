package homework.lesson9;

/*
Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
- Пароль состоит из 8 символов
- В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
- Пароль обязательно должен содержать Большие и маленькие буквы и цифры
*/
import java.util.Random;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length password:");
        int passLength = scanner.nextInt();
        char[] arr = new char[passLength];
        generatePass(arr);
        System.out.println("Password: " + arr);
    }
    static void generatePass (char[] arr) {
        Random random = new Random();
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*()[]{}";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = symbols.charAt(random.nextInt(symbols.length()));
        }
    }
}