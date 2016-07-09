package week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("speed km/h: ");
        double value1 = scanner.nextDouble();
        System.out.print("distance km: ");
        double value2 = scanner.nextDouble();
        double time = value2/value1;
        System.out.print("time in hours: " + time);
    }
}
