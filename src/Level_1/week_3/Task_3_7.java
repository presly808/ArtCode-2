package Level_1.week_3;

/**
 * Created by oleksandr.maslovskyj on 03.08.2016.
 * Найти самое длинное слово в строке(разделенное одним пробелом)
 */
public class Task_3_7 {


    public static void main(String[] args) {
        String str = findSrtingWithMaxLength("qwert qweqweqwe sdfsdgdfgfdg fdgdfgdfg sdf df dsfdsf");
        System.out.println("самое длинное слово в строке: " + str);
    }

    public static String[] splitString(String str){
        return str.split(" ");
    }

    public static String findSrtingWithMaxLength(String str) {
        String[] stringArray = splitString(str);
        String maxString = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= maxString.length()) {
                maxString = stringArray[i];
            }
        }
        return maxString;
    }
}
