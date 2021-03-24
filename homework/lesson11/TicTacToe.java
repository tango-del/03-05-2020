package homework.lesson11;

/**
 * Занятие №11
 * Крестики-Нолики
 * <p>
 * Используемые символы:
 * \u00B7 - Message waiting symbol - пустая ячейка
 * <p>
 * 1. Инициализировать поле
 * 2. Игрок - Х, Компьютер - О
 * 3. Ход игрока по координатам [X, Y]
 * 4. Ход компьютера по координатам [X, Y]
 * 5. Проверить победу
 * 6.  Проанализировать и почистить код где это возможно
 * 7.  ** Искусвенный интелект для победы компьютера
 * . . . [0][1 2 3]
 * . . . [1][1 2 3]
 * . . . [2][1 2 3]
 */
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        init();
    }

    static void init() {
        System.out.println("Game starting ....");

        char[][] field = getField();

        drawField(field);

        char playerSign = 'X';
        char computerSign = 'O';
        char noWinner = 'N';
        char currentPlayerSign = playerSign;

        boolean isWin;

        do {
            doMove(field, currentPlayerSign);
            drawField(field);
            isWin = checkWin(field, currentPlayerSign);

            if (!isWin) {
                if (checkForSymbols(field)) {
                    currentPlayerSign = switchPlayerSign(currentPlayerSign);
                } else {
                    currentPlayerSign = noWinner;
                    break;
                }
            }
            //  Предусмотреть ничью чтобы завершить игру
        } while (!isWin);


        //  Вынести Поздравление с победой в отдельную функцию
        printWinner(currentPlayerSign);
    }

    static void printWinner(char currentPlayerSign) {
        String winnerName = "";
        if (currentPlayerSign == 'X') {
            winnerName = "Player";
        } else if (currentPlayerSign == 'O') {
            winnerName = "Computer";
        } else if (currentPlayerSign == 'N'){
            winnerName = "NoOne";
        }

        System.out.println(winnerName == "NoOne" ? "Ничья!!!!" : "Congrats!!! You are winner Mr. " + winnerName);
    }

    static boolean checkWin(char[][] field, char currentPlayerSign) {
        if (field[0][0] == currentPlayerSign && field[0][1] == currentPlayerSign && field[0][2] == currentPlayerSign) {
            return true;
        } else if (field[1][0] == currentPlayerSign && field[1][1] == currentPlayerSign && field[1][2] == currentPlayerSign) {
            return true;
        } else if (field[2][0] == currentPlayerSign && field[2][1] == currentPlayerSign && field[2][2] == currentPlayerSign) {
            return true;
        } else if (field[0][0] == currentPlayerSign && field[1][0] == currentPlayerSign && field[2][0] == currentPlayerSign) {
            return true;
        } else if (field[0][1] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][1] == currentPlayerSign) {
            return true;
        } else if (field[0][2] == currentPlayerSign && field[1][2] == currentPlayerSign && field[2][2] == currentPlayerSign) {
            return true;
        } else if (field[0][0] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][2] == currentPlayerSign) {
            return true;
        } else if (field[0][2] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][0] == currentPlayerSign) {
            return true;
        }

        //  Завершить все возможнные проверки на победу

        return false;
    }

    static char switchPlayerSign(char currentPlayerSign) {
        //  Переделать на тернарный оператор
        //  Вынести проверку игрока-человека в отдельную функцию и применить ее
        return isPlayerSign(currentPlayerSign) ? 'O' : 'X';
    }

    static boolean isPlayerSign(char currentPlayerSign) {
        if (currentPlayerSign == 'X'){
            return true;
        }

        return false;
    }

    static void doMove(char[][] field, char currentPlayerSign) {
        if (isPlayerSign(currentPlayerSign)) {
            doMovePlayer(field, currentPlayerSign);
        } else {
            doMoveComputer(field, currentPlayerSign);
        }
    }

    static void doMovePlayer(char[][] field, char playerSign) {
        //  Проверка на ввод координат выходящих за пределы поля 3х3
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            boolean check;
            do {
                System.out.println("Input X-Coordinate [1, 2, 3]");
                x = scanner.nextInt();
                System.out.println("Input Y-Coordinate [1, 2, 3]");
                y = scanner.nextInt();
                check = x > 0 && x <= 3 && y > 0 && y <= 3;
                if (check == false) {
                    System.out.println("Index out of exception. Try again:");
                }
            } while (!check);
        } while (isNotEmptyCell(field, x - 1, y - 1));

        field[x - 1][y - 1] = playerSign;
    }

    /**
     * Получить целочисленное число в диапозоне включая максимальное число
     * (int) (Math.random() * (max - min + 1) + min)
     * либо эквивалентно Random random = new Random(); random.nextInt(max + 1)
     */
    static void doMoveComputer(char[][] field, char computerSign) {
        System.out.println("Computer's move ...");

        int randX;
        int randY;
        do {
            randX = (int) (Math.random() * 3); // 0 1 2
            randY = (int) (Math.random() * 3);
        } while (isNotEmptyCell(field, randX, randY));

        field[randX][randY] = computerSign;
    }

    static boolean isNotEmptyCell(char[][] field, int x, int y) {
        //Эквивалентно записи return field[x][y] != '\u00B7'
        return !isEmptyCell(field, x, y);
    }

    static boolean checkForSymbols(char[][] field) {
        boolean check = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '\u00B7') {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }

    static boolean isEmptyCell(char[][] field, int x, int y) {
        return field[x][y] == '\u00B7';
    }

    static char[][] getField() {
        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '\u00B7';
            }
        }
        return arr;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.print("\n");
        }
    }
}