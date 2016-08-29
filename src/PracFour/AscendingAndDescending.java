package PracFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Xileus on 22/08/2016.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num, num2, num3;
        num = scanner.nextInt();
        System.out.println("Enter a second");
        num2 = scanner.nextInt();
        System.out.println("Enter a third");
        num3 = scanner.nextInt();
        integers.add(num);
        integers.add(num2);
        integers.add(num3);
        Collections.sort(integers);
        for (int i = 0; i<integers.size(); i++) {
            System.out.printf(integers.get(i)+" ");

        }
        System.out.println();
        for (int i = integers.size()-1; i>=0; i--) {
            System.out.printf(integers.get(i)+" ");

        }
    }
}
