package Level_1.week_2;

/**
 * Created by oleksandr.maslovskyj on 20.07.2016.
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
   который получается в результате суммы arr1[i] + arr2[i]
 */
public class Task_4_8 {

    public static void main(String[] args) {
        generateSumArray();
    }

    public static void generateSumArray(){
        int[] array1 = ArrayUtils.generateArray(10);
        int[] array2 = ArrayUtils.generateArray(10);

        System.out.print("sum for array1 + arra2: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] + array2[i];
            System.out.print(array1[i] + ",");
        }
    }
}
