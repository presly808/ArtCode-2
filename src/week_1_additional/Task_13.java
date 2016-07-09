package week_1_additional;
//
//Даны три числа A,B,C. Увеличить числа в два
//        раза, если A+B+C>0, в противном случае заменить
//        на нули.
/**
 * Created by pc on 09.07.2016.
 */
public class Task_13 {

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        if (a+b+c > 0) {
            System.out.println("rez: " + a*2 + " " + b*2 + " " + c*2);
        }else {
            a = b = c = 0;
            System.out.println("rez: " + a + " " + b + " " + c);
        }
    }
}
