package week_2_additional;

import java.util.Scanner;

/**
 * Created by pc on 23.07.2016.
 * Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */
public class Task_7_2_3 {

    public static void main(String[] args) {

        String str = generateString();
        char[] array = convertStringToArray(str);
        findSymbolInString(array);

    }

    public static String generateString(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("put string: ");
        String str = scanner.nextLine();
        return str;
    }

    public static char[] convertStringToArray(String str){

        char[] array = str.toCharArray();
        return array;
    }

    public static void findSymbolInString(char[] array){
        Scanner scanner = new Scanner(System.in);

        System.out.print("put symbol: ");
        String str = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            String tmp = array[i] + "";
            if (str.equals(tmp)) {
                counter++;
            }
        }
        System.out.print("symbol `" + str + "` in string repeated " + counter + " times");
    }
}
