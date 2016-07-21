package week_2;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 19.07.2016.
 */
public class ArrayUtils {

    public static int[] generateArray(int length) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("range value: ");
        int range = scanner.nextInt();

        int[] array = new int[length];
        System.out.print("array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = randomValue(range);
            System.out.print(array[i] + ",");
        }
        System.out.println();
        return array;
    }

    public static int[] generateArrayWithTwoRanges(int length){
        Scanner scanner = new Scanner(System.in);

        int range2 = 25;
        int range1 = 50;

        int[] array = new int[length];
        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomValue(range1, range2);
            System.out.print(array[i] + ",");
        }

        System.out.println();
        return array;
    }

    public static int randomValue(int range1, int range2){
        int randomValue = ((int)(Math.random() * range1)) + range2;
        return randomValue;
    }

    public static int randomValue(int range){
        int randomValue = (int)(Math.random() * range);
        return randomValue;
    }
}
