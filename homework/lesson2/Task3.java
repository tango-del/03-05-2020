package homework.lesson2;

/*
3.Создать 4 произвольных перегруженных метода .
 */
public class Task3 {
    public static void main(String[] args) {
        int a = hm(5437, 3152);
        int b = hm(19, 5, 3152);
        double c = hm(999.33, 279.6);
        double d = hm(98.13, 63.53, 42.11);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    static int hm(int x, int y) {
        return  x - y;
    }
    static int hm(int x, int y, int z) {
        return  x * y + z;
    }
    static double hm(double x, double y) {
        return x / y;
    }
    static double hm(double x, double y, double z) {
        return (x + y) / z;
    }
}