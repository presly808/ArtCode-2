package Level_1.week_1;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_5_3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("value: ");
        int value = scanner.nextInt();
        int counter = 0;
        char var = '8';
        String str = Integer.valueOf(value).toString();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == var) {
                counter++;
            }
        }
        System.out.println("8: " + counter);
    }
}
