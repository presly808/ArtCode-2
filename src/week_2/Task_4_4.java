package week_2;
import week_2.ArrayUtils;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 19.07.2016.
 *  Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Task_4_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter value: ");
        String userValue = scanner.nextLine();
        countValue(userValue);
    }

    public static void countValue(String userValue){
        int[] array = ArrayUtils.generateArray(10);
        String str = array.toString();
        char[] charArray = str.toCharArray();

        int counter = 0;
        System.out.println("array: ");
        for (int i = 0; i < charArray.length; i++) {
            if (array[i] == userValue.charAt(0)) {
                counter++;
            }
            System.out.print(charArray[i] + ",");
        }

        for (int strArray : array)
        System.out.println("value " + userValue + " in generated array: " + " repeated " + counter + " times");
    }

}
