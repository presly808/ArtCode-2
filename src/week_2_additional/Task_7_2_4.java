package week_2_additional;

import java.util.Scanner;

/**
 * Created by pc on 23.07.2016.
 * Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
   Количество позиций и массив указывает пользователь
 */
public class Task_7_2_4 {

    public static void main(String[] args) {
        moveValue();
    }

    public static void moveValue(){
        Scanner scanner = new Scanner(System.in);

        int[] arra = {1,2,3,4,5};
        System.out.print("value to move: ");
        int moveValue = scanner.nextInt();

        int[] tmpArray = new int[arra.length];
        for (int i = 0; i < moveValue; i++) {
            tmpArray[i] = arra[arra.length - moveValue + i];
        }

        for (int i = 0; i < arra.length - moveValue; i++) {
            arra[i + moveValue] = arra[i];
        }

        for (int i = 0; i < moveValue; i++) {
            arra[i] = tmpArray[i];
        }

        for(int str:arra)
            System.out.print(str);
    }

}
