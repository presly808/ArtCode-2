import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a >= 10) {
            while (a >= 10){
                a = a%10;
            }
        }else {
            a = a%1;
        }
        if (b >= 10) {
            while (b >= 10){
                b = b%10;
            }
        }else {
            b = b%1;
        }
        if (a == b) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
