package Level_1.week_2;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 19.07.2016.
 * Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Task_4_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter value: ");
        int userValue = scanner.nextInt();

        countValue(userValue);
    }

    public static void countValue(int userValue){
        int[] array = ArrayUtils.generateArray(10);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userValue) {
                counter = counter + 1;
            }
        }
        System.out.println("value " + userValue + " in generated array: " + " repeated " + counter + " times");
    }

}
