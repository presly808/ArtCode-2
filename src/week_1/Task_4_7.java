package week_1;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        if (b >= a) {
            if (b%a == 0){
                System.out.println("true: " + b/a + " : " + 0);
            }else{
                System.out.println("false: " + b/a + " : " + b%a);
            }
        }
        if (b < a) {
            if (a%b == 0){
                System.out.println("true: " + a/b + " : " + 0);
            }else{
                System.out.println("false: " + a/b + " : " + a%b);
            }
        }
    }
}
