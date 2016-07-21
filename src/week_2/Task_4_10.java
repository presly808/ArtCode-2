package week_2;
import week_2.ArrayUtils;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 21.07.2016.
 */
public class Task_4_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayUtils.generateArray(10);

        System.out.print("enter start: ");
        int start = scanner.nextInt();

        System.out.print("enter end: ");
        int end = scanner.nextInt();

        splitArray(array, start, end);

    }

    public static int[] splitArray(int[] arr, int start, int end){

        if (start >= 1 && end <= arr.length) {

            for (int i = 0; i < arr.length; i++) {
                if (i >= start - 1 && i <= end - 1) {
                    i = i + (end - (start - 1));
                }
                System.out.print(arr[i] + ",");
            }
        }
        return arr;
    }
}
