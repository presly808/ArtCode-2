package Level_1.week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("month: ");
        int number = scanner.nextInt();
        while (!(number <= 12 && number >= 1)){
            System.out.println("incorrect month");
            System.out.print("month: ");
            number = scanner.nextInt();
        }
        if (number == 1) {
            System.out.print("month: Январь");
        }else {
            if (number == 2) {
                System.out.print("month: Февраль");
            }else {
                if (number == 3) {
                    System.out.print("month: Март");
                }else {
                    if (number == 4) {
                        System.out.print("month: Апрель");
                    }else {
                        if (number == 5) {
                            System.out.print("month: Май");
                        }else {
                            if (number == 6) {
                                System.out.print("month: Июнь");
                            }else {
                                if (number == 7) {
                                    System.out.print("month: Июль");
                                }else {
                                    if (number == 8) {
                                        System.out.print("month: Август");
                                    }else {
                                        if (number == 9) {
                                            System.out.print("month: Сентябрь");
                                        }else {
                                            if (number == 10) {
                                                System.out.print("month: Октябрь");
                                            }else {
                                                if (number == 11) {
                                                    System.out.print("month: Ноябрь");
                                                }else {
                                                    if (number == 12) {
                                                        System.out.print("month: Декабрь");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
