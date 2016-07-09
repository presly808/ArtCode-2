package week_1_additional;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_10 {

    final static double price = 1.5;
    public static void main(String[] args) {
        System.out.print(costOfSpeaking(1.2,7));
    }

    public static double costOfSpeaking(double timeSpeaking, int day){
        double cost = 0;
        if (day == 6 || day == 7) {
            cost = timeSpeaking * price * 0.8;
        }else{
            cost = timeSpeaking * price;
        }
        return cost;
    }
}
