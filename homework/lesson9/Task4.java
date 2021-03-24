package homework.lesson9;

/*
Существует выдуманное имя Alpha.
Спустя тысячелетия, имя перекочевало по множествам миров и приобрело
форму типичную для локального диалекта, но произношение осталось неизменным.
Ученые собрали информацию о возможных именах в массив и решились определить
есть ли среди имен [Alpha, Alfa, Alpfa] самое короткое.
Найти самое короткое имя и вывести его в консоль для обозрения
*/
public class Task4 {
    public static void main(String[] args) {
        String[] names = new String[]{"Alpha", "Alfa", "Alpha"};
        minLength(names);
    }
    static void minLength(String[] arr) {
        int min = 0;
        String name = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() < arr[i + 1].length()) {
                min = arr[i].length();
                name = arr[i];
            }
        }
        System.out.println("Name: " + name + " with length: " + min + " are most short");
    }
}