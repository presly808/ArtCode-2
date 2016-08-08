package Level_1.week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("value: ");
        int value = scanner.nextInt();
        String str = Integer.valueOf(value).toString();
        char[] array = str.toCharArray();
        boolean rez = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]== array[j]) {
                    rez = rez && true;
                }else {
                    rez = rez && false;
                }
            }
        }
        System.out.println("task a: " + rez);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]== array[j]) {
                    rez = rez || true;
                }else {
                    rez = rez || false;
                }
            }
        }
        System.out.println("task b: " + rez);
    }
}
