package homework.lesson9;

/*
Специалисты по латинском алфавиту собрали все возможные буквы
(маленькие и большие) и записали их на отдельные листки после отсортировав.
Во время ланча, из-за незакрытого окна, ветер разнес все листки по кабинету.
Команда сумела их собрать, но отсортировать так и не удалось.
Необходимо отсортировать алфавит от маленьких букв к большим по их порядковому возрастанию, как настоящих алфавитах
К примеру, EadAcDeC должно превратится в acdeACDE
*/
public class Task7 {
    public static void main(String[] args) {
        String str = "EadAcDeC";
        copyCharac(str);
    }

    static void copyCharac(String str) {
        String smallstr = "";
        String bigstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                smallstr += str.charAt(i);
                //copy all characters a...z (according ASCII) to new String
            }
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                //characters A...Z
                bigstr += str.charAt(i);
            }
        }
        sortBuuble(smallstr, bigstr);
    }

    static void sortBuuble(String smallstr, String bigstr) {
        char[] small = smallstr.toCharArray();
        char[] big = bigstr.toCharArray();
        //create new arrays and assign them characters
        for (int i = 0; i < small.length; i++) {
            for (int j = 0; j < small.length - 1; j++) {
                if (small[j] > small[j + 1]) {
                    char temp = small[j];
                    small[j] = small[j + 1];
                    small[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < big.length - 1; j++) {
                if (big[j] > big[j + 1]) {
                    char temp = big[j];
                    big[j] = big[j + 1];
                    big[j + 1] = temp;
                }
            }
        }
        output(small, big);
    }

    static void output(char[] small, char[] big) {
        //converting two char arrays to String and output result
        String arr = new String(small);
        String arr2 = new String(big);
        String result = arr + arr2;
        System.out.println(result);
    }
}