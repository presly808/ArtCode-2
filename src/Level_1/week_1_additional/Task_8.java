package Level_1.week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("покупка: ");
        int number = scanner.nextInt();
        if (number > 1000) {
            System.out.println("ціна: " + number*0.9);
        }else {
            System.out.println("ціна: " + number);
        }
    }
}
