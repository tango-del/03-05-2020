package homework.lesson9;

/*
Дано выражение на чешском языке správné řešení úkolu.
Написать эквивалентное выражение при помощи Unicode и сохранить его в виде массива.
Результат вывести в консоль
*/
public class Task8 {
    public static void main(String[] args) {
        String str = "\u0073\u0070\u0072\u00E1\u0076\u006E\u00E9\u0020\u0159\u0065\u0161\u0065\u006E\u00ED\u0020\u00FA\u006B\u006F\u006C\u0075";
        char[] arr2 = str.toCharArray();
        System.out.println(arr2);
        char[] arr = new char[]{'\u0073', '\u0070', '\u0072', '\u00E1', '\u0076', '\u006E', '\u00E9', '\u0020', '\u0159', '\u0065', '\u0161', '\u0065', '\u006E', '\u00ED', '\u0020', '\u00FA', '\u006B', '\u006F', '\u006C', '\u0075'};
        System.out.println(arr);
    }
}