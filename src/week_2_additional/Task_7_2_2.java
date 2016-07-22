package week_2_additional;
import week_2.ArrayUtils;
/**
 * Created by oleksandr.maslovskyj on 21.07.2016.
 * Проверить или является число простым
 */
public class Task_7_2_2 {

    public static void main(String[] args) {
        simpleValue();
    }

    public static void simpleValue(){

        int[] array = ArrayUtils.generateArray(10);

        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
                for (int j = 2; j <= array[i]; j++) {
                    if (array[i] % 2 != 0 && array[i] / j == 1 && j == array[i]) {
                        array[i] = 0;
                    }
                }
            System.out.print(array[i] + ",");
        }
    }
}
