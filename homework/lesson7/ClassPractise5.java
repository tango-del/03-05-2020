package homework.lesson7;

/*
Создать двумерную матрицу (5х5) в виде массива
в которой значения будут равны 0
кроме прямоугольного треугольника.
Выведенная матрица в консоль
должно выглядеть следующим образом:
1 0 0 0 0
1 2 0 0 0
1 2 3 0 0
1 2 3 4 0
1 2 3 4 5
*/
public class ClassPractise5 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = j + 1;
            }
        }
        printArray(matrix);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}