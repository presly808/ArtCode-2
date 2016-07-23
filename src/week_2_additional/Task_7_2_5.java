package week_2_additional;

/**
 * Created by pc on 23.07.2016.
 * Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
 */
public class Task_7_2_5 {

    public static void main(String[] args) {

        change();
    }

    public static void change(){
        String str = "array is a data type";
        System.out.println(str);

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                array[i] = '@';
            }
            System.out.print(array[i]);
        }

    }
}
