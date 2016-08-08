package Level_1.week_1_additional;

/**
 * Created by pc on 09.07.2016.
 */
public class Task_15 {

    public static boolean compareCircleInArea = false;
    public static boolean compareAreaInCircle = false;
    public static void main(String[] args){
        compareCircleinArea(123, 124);
        System.out.println("уместится ли круг в квадрат: " + compareCircleInArea + ", уместится ли квадрат в круге: " + compareAreaInCircle);
    }
    public static void compareCircleinArea(double squareCircle, double squareArea){

        double circleR = Math.sqrt(squareCircle/3.14);
        double areaR = Math.sqrt(squareArea);
        if (circleR <= areaR/2) {
            compareCircleInArea = true;
        }else {
            compareCircleInArea = false;
        }
        if (areaR <= circleR*2) {
            compareAreaInCircle = true;
        }else {
            compareAreaInCircle = false;
        }
    }

}
