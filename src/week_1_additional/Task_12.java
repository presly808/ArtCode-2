package week_1_additional;

import java.util.Scanner;

/**
 * Created by pc on 09.07.2016.
 */

//12) Написать программу, которая в зависимости от характера ветра выдает
//        сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
//        умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
// пункт 2 суперечить пункту 3 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Task_12 {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);
        System.out.print("speed: ");
        int speed = scanner.nextInt();
        if (speed >=1 && speed <=4) {
            System.out.println(speed + " m/s: " + " слабый");
        }else {
            if (speed >= 5 && speed <= 10) {
                System.out.println(speed + " m/s: "  + " умеренный");
            }else {
                if (speed > 10 && speed <= 18) {
                    System.out.println(speed + " m/s: " + " сильный");
                }else {
                    if (speed > 19) {
                        System.out.println(speed + " m/s: " + " ураганный");
                    }
                }
            }
        }
    }
}
