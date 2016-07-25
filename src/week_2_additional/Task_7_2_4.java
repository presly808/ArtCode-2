package week_2_additional;

import java.util.Scanner;

/**
 * Created by pc on 23.07.2016.
 * Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
   Количество позиций и массив указывает пользователь
 */
public class Task_7_2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("value to move: ");
        int moveValue = scanner.nextInt();

        int[] arra = {1,2,3,4,5};
        int[] newArray = moveValue(arra, moveValue);
        displayArray(newArray);
    }

    public static int[] moveValue(int[] arra, int moveValue){
        int[] tmpArray = new int[arra.length];

        for (int i = moveValue; i < arra.length; i++) {
            for (int j = 0; j < moveValue; j++) {
                tmpArray[j] = arra[i];
                i++;
            }
        }

        for (int i = 0; i < moveValue; i++) {
            for (int j = moveValue; j < tmpArray.length; j++) {
                tmpArray[j] = arra[i];
                i++;
            }
        }
        return tmpArray;
    }

    public static void displayArray(int[] array){
        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

}
