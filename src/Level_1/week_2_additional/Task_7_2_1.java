package Level_1.week_2_additional;
import Level_1.week_2.ArrayUtils;

import java.util.Arrays;

/**
 * Created by oleksandr.maslovskyj on 21.07.2016.
 * Инвертировать массив (без использования допольнительного массива)
 */
public class Task_7_2_1 {

    public static void main(String[] args) {

        int[] array = ArrayUtils.generateArray(10);
        invertArray(array);
    }

    public static void invertArray(int[] arr){

        for (int i = 0; arr.length / 2 > i; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

