package homework.lesson9;

/*
В вашей армии состоит 54 существа
Все они записаны у вас в виде массива с обозначением
H (Human), О (Orc), E (Elf), D (Dwarf)
Напишите функцию, которая считает кого у вас больше
[H, O, O, D, E, H ...]
*/
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        char[] army = new char[54];
        initArray(army);
    }
    static void initArray(char[] arr) {
        Random random = new Random();
        int Human = 0;
        int Orc = 0;
        int Dwarf = 0;
        int Elf = 0;
        char[] characters = new char[]{'\u0048', '\u004f', '\u0044', '\u0045'};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = characters[random.nextInt(characters.length)];
            if (arr[i] == 'H') {
                Human++;
            } else if (arr[i] == 'O') {
                Orc++;
            } else if (arr[i] == 'D') {
                Dwarf++;
            } else if (arr[i] == 'E') {
                Elf++;
            }
        }
        calcMax(Human, Orc, Dwarf, Elf);
    }
    static void calcMax(int H, int O, int D, int E) {
        int max = 0;
        if (H > O && H > D && H > E){
            max = H;
            System.out.println("Human are most populated: " + max);
        } else if (O > H && O > D && O > E) {
            max = O;
            System.out.println("Orcs are most populated: " + max);
        } else if (D > H && D > O && D > E) {
            max = D;
            System.out.println("Dwarfs are most populated: " + max);
        } else if (E > H && E > O && E > D) {
            max = E;
            System.out.println("Elfs are most populated: " + max);
        } else {
            System.out.println("Two or more races have the same number of population");
        }
    }
}