import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_5_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("value: ");
        int value = scanner.nextInt();
        int rez = 1;
        for (int i = 1; i <= value; i++) {
            rez = rez*i;
        }
        System.out.println("rez: " + rez);
    }
}
