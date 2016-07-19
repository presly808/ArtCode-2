package week_2;
import week_2.ArrayUtils;

import java.util.Scanner;

/**
 * Created by pc on 19.07.2016.
 * Найти среднее арифметическое массива
 */
public class Task_4_6 {

    public static void main(String[] args) {

        serArf();

    }

    public static double serArf(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter length: ");
        int length = scanner.nextInt();

        int[] array = ArrayUtils.generateArray(length);
        double result = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        result = sum / array.length;
        System.out.println(sum + " / " + array.length + " = " + result);

        return result;
    }

}
