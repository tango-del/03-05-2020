package homework.lesson9;

/*
Дано предложение Hello, World! Необходимо его развернуть !dlroW ,olleH
*/
public class Task10 {
    public static void main(String[] args) {
        String hello = "Hello, World!";
        char[] arr = hello.toCharArray();
        String reverse = "";
        for (int i = hello.length() - 1; i >= 0; i--) {
            reverse += hello.charAt(i);
        }
        System.out.println(reverse);
    }
}