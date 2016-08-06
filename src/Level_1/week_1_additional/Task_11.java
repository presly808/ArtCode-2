package Level_1.week_1_additional;

import java.util.Scanner;

/**
 * Created by pc on 09.07.2016.
 */
//
//11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
//        добавляет к нему слово "копейка" в правильной форме. Например, 1
//        копейка, 5 копеек, 42 копейки .
    // 1 копейка
    // 2 копейки
    // 5 копеек
    //
    //

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("value: ");
        int value = scanner.nextInt();
        while (!(value >=1 && value <=99)){
            System.out.print("value: ");
            value = scanner.nextInt();
        }
        if (value % 10 == 1) {
            System.out.println(value + " копейка");
        }else {
            if ((value % 10) >=2 && (value%10)<5) {
                System.out.println(value + " копейки");
            }else {
                System.out.println(value + " копеек");
            }
        }

    }
}
