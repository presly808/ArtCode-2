package Level_1.week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("value km/h: ");
        double value1 = scanner.nextInt();
        System.out.print("value m/s: ");
        double value2 = scanner.nextInt();
        double value3 = (value1*1000)/3600;
        if (value2 >= value3) {
            System.out.println("bigger m/s: "+value2);
        }else {
            System.out.println("bigger km/h: "+value1);
        }
    }
}
