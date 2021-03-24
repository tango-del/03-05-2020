package homework.lesson5;

public class Task1 {
    public static void main(String[] args) {
        byte[] arr = new byte[1000];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(byte) (Math.random() * 1000);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
//Создать массив типа byte на 1000 элементов.
//Заполнить его случайными числами.
//Найти сумму всех элементов массива.
