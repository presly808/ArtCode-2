package Level_1.week_3;

/**
 * Created by oleksandr.maslovskyj on 27.07.2016.
 */
public class ArrayUtils {

    public static int generateRandomValue(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

    public static String toString(int[][] matrix){

        if (matrix.length == 0) {
            return "matrix empty";
        }
        if (matrix == null) {
            return "wrong argument";
        }

        String result = "";
        for (int i = 0; i < matrix.length; i++) {

            int[] tmp = matrix[i];
            for (int j = 0; j < tmp.length; j++) {
                int num = tmp[j];
                result += num + " ";
            }

            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static String toString(boolean[][] matrix){

        if (matrix.length == 0) {
            return "matrix empty";
        }
        if (matrix == null) {
            return "wrong argument";
        }

        String result = "";
        for (int i = 0; i < matrix.length; i++) {

            boolean[] tmp = matrix[i];
            for (int j = 0; j < tmp.length; j++) {
                result += tmp[j] + " ";
            }

            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static void printArray(int[] array){

        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
