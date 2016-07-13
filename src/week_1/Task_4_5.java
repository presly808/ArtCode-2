package week_1;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("rez: " + (a-b));
        }else {
            System.out.println("rez: " + (a+b));
        }
    }

}
