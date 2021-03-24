package homework.lesson9;

/*
Преподаватель языковой школы проверяет домашнее задание ученика И
Ученик И создал массив с словесными выражениями, которые содержать ошибки
[“Даная книга”, “Ложька”, “Йолка”].
Программа выводит в консоль данные массива и последовательно начинает исправлять ошибки, затем результат выводит в консоль
*/
public class Task11 {
    public static void main(String[] args) {
        String[] homework = new String[]{"Даная книга", "Ложька", "Йолка"};
        System.out.println("Before:");
        printArray(homework);
        correctFirst(homework);
        correctSecond(homework);
        correctLast(homework);
        System.out.println("After:");
        printArray(homework);
    }

    static void correctFirst(String[] homework) {
        char[] first = homework[0].toCharArray();
        char[] letters = new char[first.length + 1];
        for (int i = 0; i < first.length; i++) {
            letters[i] = first[i];
        }
        for (int i = letters.length - 1; i > 2; i--) {
            letters[i] = letters[i - 1];
        }
        String firstList = new String(letters);
        homework[0] = firstList;
    }

    static void correctSecond(String[] homework) {
        char[] second = homework[1].toCharArray();
        char[] letters = new char[second.length - 1];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = second[i];
        }
        for (int i = letters.length - 1; i > 2; i--) {
            //Ложька
            //Ложьк
            //Ложка
            letters[i] = second[i + 1];
        }
        String secondList = new String(letters);
        homework[1] = secondList;
    }

    static void correctLast(String[] homework) {
        char[] third = homework[2].toCharArray();
        char[] letters = new char[third.length - 1];
        for (int i = letters.length - 1; i >= 0; i--) {
            letters[i] = third[i + 1];
        }
        letters[0] = '\u0401';
        String lastList = new String(letters);
        homework[2] = lastList;
    }

    static void printArray(String[] homework) {
        System.out.print("[");
        for (int i = 0; i < homework.length; i++) {
            System.out.print(homework[i] + " ");
        }
        System.out.println("]");
    }
}