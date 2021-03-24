package homework.lesson8;

/*
Известен рост и фамилии 9 человек.
Определить фамилию человека
рост которого оказался бы посередине
в случае выстраивания их по ранжиру
*/
public class Task6 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1.79", "Ivan"},
                {"2.06", "Den"},
                {"1.33", "Alex"},
                {"1.98", "Oleg"},
                {"1.52", "Vanya"},
                {"1.23", "Dimitry"},
                {"1.48", "Mike"},
                {"2.13", "Maks"},
                {"1.87", "Sergey"},
        };
        sortSoldiers(arr);
        printArray(arr);
    }
    static void sortSoldiers(String[][] arr) {
        Float buf;
        String temp2;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (Float.valueOf(arr[j][0]) > Float.valueOf(arr[j + 1][0])) {
                    buf = Float.valueOf(arr[j][0]);
                    temp2 = arr[j][1];
                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][0] = String.valueOf(buf);
                    arr[j + 1][1] = temp2;
                }
            }
        }
        String soldierHeight = arr[arr.length / 2][0];
        String soldierName = arr[arr.length / 2][1];
        System.out.println("Name: " + soldierName);
        System.out.println("Height: " + soldierHeight);
    }
    static void printArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}