package week_3;
import java.util.Scanner;

/**
 * Created by pc on 27.07.2016.
 * Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class Task_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("div to: ");
        int value = scanner.nextInt();

        System.out.print("change to: ");
        int changeTo = scanner.nextInt();

        System.out.print("line: ");
        int line = scanner.nextInt();

        System.out.print("column: ");
        int column = scanner.nextInt();

        System.out.print("min: ");
        int min = scanner.nextInt();

        System.out.print("max: ");
        int max = scanner.nextInt();

        int [][] matrix = Task_3_0.generateMatrix(line, column, min, max);
        matrix = changeValueInMatrix(matrix, value, changeTo);
        ArrayUtils.toString(matrix);
    }

    public static int[][] changeValueInMatrix(int[][] matrix, int value, int changeTo){
        for (int i = 0; i < matrix.length; i++) {

            int[] tmp = matrix[i];
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] % value == 0) {
                    tmp[j] = changeTo;
                }
            }
        }
        return matrix;
    }
}
