package PracFour;

/**
 * Created by Xileus on 29/08/2016.
 */
public class CountByThrees {
    public static void main(String[] args) {
        int i = 3;
        while (i<=300){
            if (i % 10 == 0){
                System.out.printf(" "+ i);
                System.out.println();}
            else
                System.out.printf(" "+i);
            i = i+3;
        }
    }
}
