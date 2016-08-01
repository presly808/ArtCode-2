package week_3;

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

        int result = returnLengthOfOne("000001111");
        System.out.println(result);
    }

    public static int returnLengthOfOne(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
             result = stringBuilder.indexOf("1");

        }

        return result + 1;
    }

    public static void returnLengthOfZero(String str){

    }

}
