import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        if (a+b > 11 && a+b < 19) {
            System.out.println("rez: " + (a+b));
        }else {
            System.out.println("false");
        }
    }
}
