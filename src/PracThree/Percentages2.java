package PracThree;

import java.util.Scanner;

/**
 * Created by Xileus on 10/08/2016.
 */
public class Percentages2 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        a = scanner.nextDouble();
        System.out.println("Enter another");
        b = scanner.nextDouble();
        computePercent(a, b);
        computePercent(b, a);
    }

    private static void computePercent(double a, double b) {
        double percent = (a/b)*100;
        System.out.println(a + " is " + percent + "% of " + b);
    }
}
