package homework.lesson7;

/*
Дан массив произвольных чисел в количестве десять.
Найти наименьшие и наибольшие значения и вернуть их дельту
(a+b)/2
*/
public class Task1 {
    public static void main(String[] args) {
        init();
    }

    static void init() {
        int[] randomNumbers = new int[10];
        fillNumbers(randomNumbers);
        int minNumber = sortMin(randomNumbers);
        int maxNumber = sortMax(randomNumbers);
        int deltaNumbers = findDelta(minNumber, maxNumber);
        System.out.println("Min: " + minNumber + " Max: " + maxNumber);
        System.out.println("Delta: " + deltaNumbers);
    }

    static void fillNumbers(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
    }

    static int sortMin(int[] randomNumbers) {
        int minNumber = randomNumbers[0];
        for (int i = 0; i < randomNumbers.length; i++) {
            if (minNumber > randomNumbers[i]) {
                minNumber = randomNumbers[i];
            }
        }
        return minNumber;
    }

    static int sortMax(int[] randomNumbers) {
        int maxNumber = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (maxNumber < randomNumbers[i]) {
                maxNumber = randomNumbers[i];
            }
        }
        return maxNumber;
    }

    static int findDelta(int min, int max) {
        int delta = (min + max) / 2; //Дельта минимального и максимального значения
        return delta;
    }
}
