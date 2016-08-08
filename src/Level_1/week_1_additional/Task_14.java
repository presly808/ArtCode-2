package Level_1.week_1_additional;

/**
 * Created by pc on 09.07.2016.
 */
public class Task_14 {

    public static void main(String[] args){

        int bilet = 133322;
        int [] ar = new int[6];
        while (bilet >= 1) {
        for (int i = 0; i < ar.length; i++) {
                ar[i] = bilet % 10;
                bilet = bilet / 10;
            }
        }
        if (ar[0]+ar[1]+ar[2] == ar[3]+ar[4]+ar[5]) {
            System.out.println("lucky");
        }else {
            System.out.println("not lucky");
        }
    }
}
