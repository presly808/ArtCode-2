package week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("value1: ");
        int value1 = scanner.nextInt();
        System.out.print("value2: ");
        int value2 = scanner.nextInt();
        System.out.print("value3: ");
        int value3 = scanner.nextInt();
        if (value1 == value2 || value1 == value3 || value2 == value3) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
