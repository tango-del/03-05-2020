package homework.lesson5;

public class Task5 {
    public static void main(String[] args) {
        long[] arr = new long[1000];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 500);
            sum += arr[i];
        }
        long average = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (average > arr[i]) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
/*Создать массив типа long на 1000 элементов.
Заполнить его случайными числами.
Найти элементы массива, которые меньше среднего арифметического массива и вывести в консоль.
Среднее арифметическое получается от сложения данных величин и деления этой суммы на число этих величин
*/