package Level_1.week_2;

import java.util.Scanner;

/**
 * Created by pc on 19.07.2016.
 * Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Task_4_5 {

    public static void main(String[] args) {

        generateArray();

    }

    public static void generateArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.print("enter length: ");
        int range = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = ArrayUtils.randomValue(range);

            if (i % 2 == 0) {
                if (array[i] % 2 != 0) {
                    array[i] = array[i] + 1;
                }
            } else {
                if (array[i] % 2 == 0) {
                    array[i] = array[i] + 1;
                    }
                }

            System.out.println("i: " + i + " array value: "+ array[i]);
            }
        }
    }
