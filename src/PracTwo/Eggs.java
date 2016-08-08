package PracTwo;

import java.util.Scanner;

/**
 * Created by Xileus on 8/08/2016.
 */
public class Eggs {
    public static void main(String[] args) {
        float dozen = 3.25f;
        float single = 0.45f;
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.printf("How many eggs?");
        input = scanner.nextInt();
        int singleEggs = input%12;
        int dozens = input/12;
        float total = (singleEggs * single) + (dozens * dozen);
        System.out.println("You ordered " + input +" eggs. That's " + dozens+" dozen at $"+dozen+" per dozen and "+ singleEggs+" loose eggs at $"+single+" dollars each for a total of $"+total);
    }
}
