package week_2;

import week_2.ArrayUtils;

import java.util.Scanner;

/**
<<<<<<< Updated upstream
 * Created by oleksandr.maslovskyj on 19.07.2016.
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task_4_3 {

    public static void main(String[] args) {
        copyArrays();
    }

    public static void copyArrays() {

        int length = length();

        int[] arrayFirst = ArrayUtils.generateArray(length);
        int[] arraySecond = ArrayUtils.generateArray(length);
        compareArraysLenght(arrayFirst, arraySecond);

        System.out.print("second array: ");
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = arrayFirst[i];
            System.out.print(arraySecond[i] + ",");
        }
    }

    public static boolean compareArraysLenght(int[] array1, int[] array2) {
        boolean rez = false;

        if (array1.length == array2.length) {
            rez = true;
        } else {
            rez = false;
        }

        System.out.println("array has the same length: " + rez);
        System.out.println("----------------------------------");
        return rez;
    }

    public static int length() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("array length: ");
        int length = scanner.nextInt();

        return length;
    }
}



