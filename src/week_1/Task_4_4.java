package week_1;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        if (value >= 0.0 && value <= 1.0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
