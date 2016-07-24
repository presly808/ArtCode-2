package week_2_additional;
import week_2.ArrayUtils;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 21.07.2016.
 * Проверить или является число простым
 */
public class Task_7_2_2 {

    public static void main(String[] args) {
        simpleValue();
    }

    public static void simpleValue() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("put value: ");
        int value = scanner.nextInt();

        if (value <= 2 && value > 0) {
            System.out.println(value + " :simple");
        } else {
            int counter = 0;
            for (int i = 2; i <= value; i++) {
                if (value % i == 0) {
                    counter++;
                }
            }

            if (counter == 1) {
                System.out.println(value + ": simple");
            } else {
                System.out.println( value + ": not simple");
            }
        }
    }
}
