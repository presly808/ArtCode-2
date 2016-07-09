package week_1_additional;

import java.util.Scanner;

/**
 * Created by oleksandr.maslovskyj on 08.07.2016.
 */
public class Task_1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        System.out.print("z: ");
        double z = scanner.nextDouble();
        double max = Math.max(Math.max(x,y),z);
        double min = Math.min(Math.min(x,y),z);
        double sred = Sredn.sred(x, y, z);
        if (max == Math.sqrt(Math.pow(2,min)+ Math.pow(2,sred))) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static class Sredn{
        public static double sred(double x, double y, double z){
            double sred=0;
            if (x != Math.max(Math.max(x,y),z) && x !=Math.min(Math.min(x,y),z)) {
                sred = x;
            }else {
                if (y != Math.max(Math.max(x,y),z) && y !=Math.min(Math.min(x,y),z)) {
                    sred = y;
                }else {
                    if (z != Math.max(Math.max(x,y),z) && z !=Math.min(Math.min(x,y),z)) {
                        sred = z;
                    }
                }
            }
            return sred;
        }
    }

}
