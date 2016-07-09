package week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.print("z: ");
        int z = scanner.nextInt();
        if (x > 0) {
            System.out.println("x: " + x*x*x);
        }else {
            x=0;
            System.out.println("x: " + x);
        }
        if (y > 0) {
            System.out.println("y: " + y*y*y);
        }else {
            y=0;
            System.out.println("y: " + y);
        }
        if (z > 0) {
            System.out.println("z: " + z*z*z);
        }else {
            z=0;
            System.out.println("z: " + z);
        }

    }
}
