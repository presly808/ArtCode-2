package week_3;
/**
 * Created by oleksandr.maslovskyj on 28.07.2016.
 * Написать метод, который проверяет является ли строка палиндромом А РОЗА УПАЛА НА ЛАПУ АЗОРА
 */
public class Task_3_3 {

    public static void main(String[] args) {
        checkStringToPolindrom();
        System.out.println(checkStringToPolindrom());
    }

    public static int checkStringToPolindrom(){
        String str = "abcd abcd";
        StringBuilder tmp = new StringBuilder(str);
        int result = str.compareToIgnoreCase(String.valueOf(tmp.reverse()));
        return result;
    }

}
