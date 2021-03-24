package homework.lesson9;

/*
Создать массив char, который хранит имя и фамилию через пробел согласно таблице ASCII
*/
public class Task1 {
    public static void main(String[] args) {
        initArray();
    }

    static void initArray() {
        char[] character = new char[]{72, 101, 108, 108, 111, 44, 32, 109, 121, 32, 110, 97, 109,
                101, 32, 105, 115, 32, 68, 101, 110, 105, 115, 46, 32, 73, 39, 109, 32, 108, 101,
                97, 114, 110, 105, 110, 103, 32, 74, 97, 118, 97, 33};
        printArray(character);
    }

    static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}