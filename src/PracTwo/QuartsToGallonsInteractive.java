package PracTwo;

import java.util.Scanner;

/**
 * Created by Xileus on 8/08/2016.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int quartsInGallon = 4;
        Scanner scanner = new Scanner(System.in);

        int quarts;
        System.out.printf("How many quarts: ");
        quarts = scanner.nextInt();
        int remainder = quarts % quartsInGallon;
        int requiredQuarts = quarts/quartsInGallon;
        System.out.println("A job that needs " +quarts + " quarts requires "+ requiredQuarts+" gallons plus "+ remainder + " quarts");
    }
}
