/*
3. Поездной состав Мюнхен-Варшава.
Диспетчеру предлагается автоматически
скомплектовать состав по количеству вагонов
в диапазоне от 5 до 20. Каждый вагон имеет свой
уникальный номер от 1 до 30. В каждом вагоне 5 мест.
Занятое место равно 1, свободное - 0.
Скомплектовать поездной состав
Пример одного вагона в составе где
А есть первый вагон состава,
В - номер вагона
С - места свободные и занятые
[
	A => [
		B => 19
		C => [
			0 => 1
			1 => 0
			2 => 0
			3 => 1
			4 => 1
		]
	]
]
1)мы спрашиваем номер вагона (номер должен быть в деапазоне)
2)выводим состояние мест в вагоне
3)мы спрашиваем место
4)даётся на выбор либо заполнить место либо освободить
5)спросить продалжаем работу или нет
*/
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        start();
    }
    
    static void start() {
        Scanner scanner = new Scanner(System.in);
        String cont = "Y";
        int[][] test = new int[30][5];
        do {
            int trainNumber = check(scanner);
            int seatNumber;
            System.out.println("Train seats " + trainNumber + " :");
            print(test, trainNumber);
            System.out.println("Enter seats number from 1 up to 5 :");
            seatNumber = scanner.nextInt();
            System.out.println("Current: " + (test[trainNumber][seatNumber - 1]));
            System.out.println("0 - Place is empty. 1 - Place taken");
            test[trainNumber][seatNumber - 1] = scanner.nextInt();
            print(test, trainNumber);
            System.out.println("Want to continue? Y or N: ");
            cont = scanner.next().toUpperCase();
        } while (cont.equals("Y"));
    }
    
    static int check(Scanner scanner) {
        boolean checkNumber;
        int number;
        int minTrainRangeNumber = 5;
        int maxTrainRangeNumber = 20;
        do {
            System.out.println("Enter train number from 5 up to 20:");
            number = scanner.nextInt();
            checkNumber = number < minTrainRangeNumber || number > maxTrainRangeNumber;
            if (checkNumber) {
                System.out.println("Wrong train number. Try again:");
            }
        } while (checkNumber);
        return number;
    }
    
    static void print(int[][] test, int number) {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", test[number][i]);
        }
        System.out.print("\n");
    }
}
