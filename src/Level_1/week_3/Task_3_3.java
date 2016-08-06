package Level_1.week_3;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 28.07.2016.
 * Написать метод, который проверяет является ли строка палиндромом А РОЗА УПАЛА НА ЛАПУ АЗОРА
 */
public class Task_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String line = scanner.nextLine();

        boolean result = checkStringToPolindrom(line);
        System.out.println(result);
    }

    public static boolean checkStringToPolindrom(String str){

        StringBuilder tmp = new StringBuilder(str);
        str = str.replaceAll("\\s+","");
        String tmpStr = String.valueOf(tmp.reverse()).replaceAll("\\s+","");
        return str.equalsIgnoreCase(tmpStr);
    }

}
