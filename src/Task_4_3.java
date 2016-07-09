import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value % 7 == 0) {
            System.out.println(value*2);
        }else {
            System.out.println(value);
        }
    }
}
