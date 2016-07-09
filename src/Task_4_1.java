import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_1 {

    public static void main(String[] args){
        System.out.print("Введіть число в діапазоні від 0 до 24: ");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        while (!(time >= 0 && time <=24)){
            System.out.println("Введено не правильне значення");
            System.out.print("Введіть число в діапазоні від 0 до 24: ");
            time = scanner.nextDouble();
        }
        if (time >= 9 && time <= 18) {
            System.out.println("Я на работе ");
        }else {
            System.out.println("Я отдыхаю ");
        }

    }

}
