package PracFour;

import java.util.Scanner;

/**
 * Created by Xileus on 22/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        String string;
        if (num % 2==1)
            string = "odd";
        else
            string = "even";
        System.out.println(string);
    }
}
