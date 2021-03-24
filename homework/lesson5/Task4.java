package homework.lesson5;

public class Task4 {
    public static void main(String[] args) {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
        double minNumber = arr[0];
        int indexNumber = 0;
        for (int i = 0; i < arr.length; i++){
            if (minNumber > arr[i] && (int)arr[i] % 2 == 0) {
                minNumber = arr[i];
                indexNumber = i;
            }
        }
        System.out.println("Минимальный элемент массива: " + minNumber + " принадлежит индексу: " + indexNumber);
    }
}
/*Создать массив типа double на 1000 элементов.
Заполнить его случайными числами.
Найти минимальный из элементов массива с четным индексом и вывести в консоль число и его индекс.
*/