package homework.lesson9;

/*
Дано слово Информатика. Пусть “вырезания” и “склеивания” сформировать строку форма Ин тик
Есть слово Информатика
Из него необходимо достать подстроки
Ин тик ...
потом из этих подстрок создать новую строку
*/
public class Task9 {
    public static void main(String[] args) {
        String word = "Информатика";
        char[] arr = new char[]{word.charAt(0), word.charAt(1), 32, word.charAt(7), word.charAt(8), word.charAt(9)};
        String newWord = new String(arr);
        System.out.println(newWord);
    }
}