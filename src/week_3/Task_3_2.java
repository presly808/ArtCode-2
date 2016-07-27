package week_3;
import week_3.ArrayUtils;

import java.util.Scanner;

/**
 * Created by pc on 27.07.2016.
 * Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class Task_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("line: ");
        int line = scanner.nextInt();

        System.out.print("column: ");
        int column = scanner.nextInt();

        int[][] matrix = generateLogicMatrix(line, column);
        ArrayUtils.toString(matrix);
    }

    public static int[][] generateLogicMatrix(int line, int column){
        int[][] logicMatrix= new int[line][column];

        for (int i = 0; i < logicMatrix.length; i++) {

            int[] tmp = logicMatrix[i];
            for (int j = 0; j < tmp.length; j++) {
                if (i == j) {
                    tmp[j] = 0;
                } else {
                    tmp[j] = 1;
                }
            }
        }
        return logicMatrix;
    }
}
