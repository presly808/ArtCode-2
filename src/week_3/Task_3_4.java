package week_3;
import week_3.Task_3_0;
import week_3.ArrayUtils;

import java.util.Scanner;

/**
 * Created by pc on 28.07.2016.
 * Создать массив, который будет состоять из диагонали матрици
 */
public class Task_3_4 {

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

        int[][] matrix = Task_3_0.generateMatrix(row, column, minSize, maxSize);
        ArrayUtils.toString(matrix);

        int[] resultArray = generateArrayFromDiagonal(matrix);
        ArrayUtils.printArray(resultArray);
    }

    public static int[] generateArrayFromDiagonal(int[][] matrix){

        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {

            int[] tmp = matrix[i];
            for (int j = 0; j < tmp.length; j++) {
                if (j == i) {
                    result[i] = tmp[j];
                }
            }

        }
        return result;
    }
}
