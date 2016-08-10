package PracThree;

import java.util.Scanner;

/**
 * Created by Xileus on 10/08/2016.
 */
public class PaintCalculator {
    public static void main(String[] args) {
        double h, w, l;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Warning, wrong order of values can give inaccurate values");
        System.out.println("Enter room height");
        h = scanner.nextDouble();
        System.out.println("Enter room width");
        w = scanner.nextDouble();
        System.out.println("Enter room length");
        l = scanner.nextDouble();
         double amount =calculateSurfaceArea(h, w, l);
        System.out.printf("To the walls of a "+h+"ft high x "+w+"ft wide x " +l+"ft room, you will need $"+amount+" worth of paint");
    }

    private static double calculateSurfaceArea(double h, double w, double l) {
        double total = 2*(h*w) + 2*(l*h);
        return calculatePaint(total);
    }

    private static double calculatePaint(double total) {
        double gallons = total/350;
        double amount = gallons * 32;
        return amount;
    }
}
