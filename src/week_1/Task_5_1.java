package week_1;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_5_1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("value: ");
        int value = scanner.nextInt();
        String line = "";
        while (value !=0)
        {
            int b = value%2;
            line = line + b;
            value = value/2;
        }
        System.out.println(line);
    }
}
