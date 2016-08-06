package Level_1.week_3;

/**
 * Created by oleksandr.maslovskyj on 03.08.2016.
 * Верхний регистр.
 */
public class Task_3_8 {

    public static void main(String[] args) {

        String fullName = changeToUpperCase("вася пупкин");
        System.out.println("new name: " + fullName);
    }

    public static String[] splitString(String str){
        return str.split(" ");
    }

    public static String changeToUpperCase(String str){

        String[] array = splitString(str);
        String fullName = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 1) {
                String name = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
                fullName += " " + name;
            }
        }
        return fullName.trim();
    }

}
