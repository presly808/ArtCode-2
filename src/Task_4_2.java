import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 07.07.2016.
 */
public class Task_4_2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valueFirst = scanner.nextInt();
        int valueSecond = scanner.nextInt();
        int valueThird = scanner.nextInt();
        System.out.println("min: " + Compare.minValue(Compare.minValue(valueFirst, valueSecond), valueThird));
        System.out.println("max: " + Compare.maxValue(Compare.maxValue(valueFirst, valueSecond), valueThird));
    }

    public static class Compare {
        public static int minValue(int valueFirst, int valueSecond) {
            int minValue = 0;
            if (valueFirst <= valueSecond) {
                minValue = valueFirst;
            }else {
                minValue = valueSecond;
            }
            return minValue;
        }

        public static int maxValue(int valueFirst, int valueSecond) {
            int maxValue = 0;
            if (valueFirst >= valueSecond) {
                maxValue = valueFirst;
            } else {
                maxValue = valueSecond;
            }
            return maxValue;
        }

    }

}
