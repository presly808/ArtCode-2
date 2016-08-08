package Level_1.week_2;

/**
 * Created by oleksandr.maslovskyj on 20.07.2016.
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class Task_4_9 {

    public static void main(String[] args) {
        compareArrays();
    }

    public static void compareArrays(){
        int[] array1 = ArrayUtils.generateArrayWithTwoRanges(10);
        int[] array2 = ArrayUtils.generateArrayWithTwoRanges(10);

        if (countValue(array1) >= countValue(array2)) {
            System.out.println("array1 has more par value than array2 " + countValue(array1));
        }else {
            System.out.println("array2 has more par value than array1 " + countValue(array2));
        }
        System.out.println("array1: " + countValue(array1));
        System.out.println("array2: " + countValue(array2));
    }

    public static int countValue(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
