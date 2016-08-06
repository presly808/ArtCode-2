package Level_1.week_3;

/**
 * Created by pc on 01.08.2016.
 * Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
 * Вход:
        10001101001
 Выход:
         (2,4) - цепочка нулей
         (5,6) - цепочка единиц
 */
public class Task_3_6 {


    public static void main(String[] args) {

        int[] result = returnArrayIndexOfNumberOne("000001111");
        System.out.println(findMaxLength(result));

    }

    public static int[] returnArrayIndexOfNumberOne(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        int[] tmpArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            tmpArray[i] = stringBuilder.indexOf("1");

        }
        return tmpArray;
    }

    public static void returnLengthOfZero(String str){

    }

    public static int findMaxLength(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] == array[i + 1] -1){
                counter++;
                i++;
            }
        }

        return counter;
    }

}
