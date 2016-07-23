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

        int[] array = {1,2,3,4,5,6,7,8,9}; //ArrayUtils.generateArray(10);
        int counter = 0;
        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 2) {
                array[i] = 0;
            } else {
                for (int j = 2; j * j <= array[i]; j++) {
                    if (array[i] % j == 0) {
                    } else {
                        array[i] = 0;
                    }
                }
            }
            System.out.print(array[i] + ",");
        }
    }
}
