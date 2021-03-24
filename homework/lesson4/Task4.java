package homework.lesson4;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10_000; i++) {
            int c = 0;
            for (int b = 1; b <= i / 2; b++) {
                //условие b < i тоже верное но тогда оно бы выполнялось в 2 раза дольше
                if (i % b == 0) {
                    c = c + b;
                }
            }
            if (c == i) {
                System.out.println(c);
            }
        }
    }
}
//Написать код, который будет вычислять совершенные числа.(до 8128)
//6 = 1 + 2 + 3
