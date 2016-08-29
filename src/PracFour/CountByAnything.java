package PracFour;

import java.util.Scanner;

/**
 * Created by Xileus on 29/08/2016.
 */
public class CountByAnything {
    public static void main(String[] args) {
        System.out.println("count by what?");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int i = j;
        int k = 0;
        while (i<=300){

            if (k == 9){
                System.out.printf(" "+ i);
                System.out.println();
                k = 0;
            }
            else {
                System.out.printf(" " + i);
                k++;
            }
            i = i+j;
        }
    }
}
