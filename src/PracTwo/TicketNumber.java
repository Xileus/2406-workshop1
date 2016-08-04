package PracTwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Xileus on 4/08/2016.
 */
public class TicketNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter ticket number - Type exit to exit");
        input = scanner.nextLine();
        while (input != "exit"){
            char[] inputArray = input.toCharArray();
            int remainder = inputArray[-1];
            int[] alteredChar = new int[inputArray.length-2];
            for (int i=0; i< inputArray.length-2; i++){
                alteredChar[i] = inputArray[i];
            }
            int number = Integer.parseInt(alteredChar.toString());
            if (number % 7 == remainder)
                System.out.println("true");
             else
                System.out.println("false");

            System.out.println("Enter ticket number - Type exit to exit");
            input = scanner.nextLine();
        }
    }
}
