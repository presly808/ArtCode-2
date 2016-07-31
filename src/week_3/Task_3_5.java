package week_3;

import java.util.Scanner;

/**
 * Created by pc on 31.07.2016.
 *  а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 *  b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Task_3_5 {

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
        int minSum = minRowSize(matrix);
        System.out.println("min Sum: " + minSum);
        int minRowNumber = findRowNumber(matrix, minSum);
        System.out.println(minRowNumber);
        System.out.println("------------------------------------------");

        int[][] array = Task_3_0.generateMatrix(2, column, minSize, maxSize);
        ArrayUtils.toString(array);
        int maxSum = maxRowSize(array);
        System.out.println("max Sum: " + maxSum);
        int maxRowNumber = findRowNumber(array, maxSum);
        System.out.println(maxRowNumber);
        System.out.println("------------------------------------------");

        matrix = changePlaces(matrix, array, minRowNumber, maxRowNumber);
        ArrayUtils.toString(matrix);
    }

    public static int[][] changePlaces(int[][] array, int[][] matrix, int minRowNumber, int maxRowNumber){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int tmpFirst = matrix[minRowNumber][i];
                matrix[minRowNumber][i] = array[maxRowNumber][j];
                array[maxRowNumber][j] = tmpFirst;
                i++;
            }
        }
        return matrix;
    }

    public static int minRowSize(int[][] array){

        int minSum = 0;
        for (int i = 0; i < array.length; i++) {

            int[] tmp = array[i];
            int tmpSum = 0;
            for (int j = 0; j < tmp.length; j++) {
                tmpSum = tmpSum + tmp[j];
            }
            if (minSum == 0) {
                minSum = tmpSum;
            }
            if (tmpSum <= minSum) {
                minSum = tmpSum;
            }
        }
        return minSum;
    }

    public static int maxRowSize(int[][] array){
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {

            int[] tmp = array[i];
            int tmpSum = 0;
            for (int j = 0; j < tmp.length; j++) {
                tmpSum = tmpSum + tmp[j];
            }
            if (maxSum == 0) {
                maxSum = tmpSum;
            }
            if (tmpSum >= maxSum) {
                maxSum = tmpSum;
            }
        }
        return maxSum;
    }

    public static int findRowNumber(int[][] matrix, int value){
        int number = 0;
        for (int i = 0; i <matrix.length; i++) {
            int tmpSum = 0;
            int[] tmp = matrix[i];
            for (int j = 0; j < tmp.length; j++) {
                tmpSum = tmpSum + tmp[j];
            }
            if (value == tmpSum) {
                number = i;
                break;
            }
        }
        return number;
    }
}
