package homework.lesson3;

/*
4. Задача на switch. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. ( Москва(905) - 1.25грн/м, Ростов(194) - 1.98грн/м, Краснодар(491) - 3.05 грн/м(сканер)
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        callCostCalc();
        callCostCalc();
        callCostCalc();
        callCostCalc();
    }
    static void callCostCalc() {
        System.out.println("Введите код города Москва(905), Ростов(194), Краснодар(491) :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 905:
                System.out.println("Стоимость 10 минутного международного разговора в Москву состовляет: " + (10 * 1.25) + " грн/м");
                break;
            case 194:
                System.out.println("Стоимость 10 минутного международного разговора в Ростов состовляет: " + (10 * 1.98) + " грн/м");
                break;
            case 491:
                System.out.println("Стоимость 10 минутного разговора в Краснодар состовляет: " + (10 * 3.05) + " грн/м");
                break;
            default:
                System.out.println("Не вверный код города");
                break;
        }
    }
}