package Level_1.week_2;

/*1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
2) Поменять местами наибольший и наименьший элементы в массиве*/

/**
 * Created by pc on 13.07.2016.
 */
public class Task_4_1 {

    public static void main(String[] args) {

        int[] array = {41,23,12,54,23,124,54,23,4,3,2,35};

        System.out.println("generated array: ");

        for(int arrayView : array)
        System.out.print(arrayView + " ");

        System.out.println("\nmin: " + minArrayValue(array));
        System.out.println("max: " + maxArrayValue(array));
        changeValuePlaces(array);
    }

    public static int minArrayValue(int[] array){

        int minArrayValue = array[0];
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (minArrayValue >= array[j]) {
                    minArrayValue = array[j];

                }
            }
        }
         return minArrayValue;
    }

    public static int maxArrayValue(int[] array) {

        int maxArrayValue = array[0];
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                 if (maxArrayValue <= array[j]) {
                    maxArrayValue = array[j];
                }
            }
        }

        return maxArrayValue;
    }

    public static void changeValuePlaces(int[] array) {

        int minArrayValue = minArrayValue(array);
        int maxArrayValue = maxArrayValue(array);

        int maxTmpPosition = array[0];
        int minTmpPosition = array[0];

        for (int i = 0; i < array.length; i++) {

            if (maxArrayValue == array[i]) {
                maxTmpPosition = i;
            }
            if (minArrayValue == array[i]) {
                minTmpPosition = i;
            }
        }

        int tmp = array[maxTmpPosition];
        array[maxTmpPosition] = array[minTmpPosition];
        array[minTmpPosition] = tmp;

        for (int arrayView : array)
        System.out.print(arrayView + " ");
    }
}
