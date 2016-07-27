package week_3;
import week_3.ArrayUtils;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 27.07.2016.
 * Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 */
public class Task_3_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("put line: ");
        int row = scanner.nextInt();

        System.out.print("put column: ");
        int column = scanner.nextInt();

        System.out.print("put minSize: ");
        int minSize = scanner.nextInt();

        System.out.print("put maxSize: ");
        int maxSize = scanner.nextInt();

        int matrix[][] = generateMatrix(row, column, minSize, maxSize);
        ArrayUtils.toString(matrix);
    }

    public static int[][] generateMatrix(int line, int column, int min, int max){
        int[][] matrix = new int[line][column];

        for (int i = 0; i < matrix.length; i++) {

            int[] columnSize = matrix[i];
            for (int j = 0; j < columnSize.length; j++) {
                matrix[i][j] = ArrayUtils.generateRandomValue(min, max);
            }
        }

        return matrix;
    }
}
