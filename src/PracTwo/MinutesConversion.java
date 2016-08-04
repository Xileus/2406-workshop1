package PracTwo;

import javax.swing.*;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Xileus on 4/08/2016.
 */
public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double numberInput;
        System.out.printf("Minutes: ");
        input = scanner.nextLine();
        numberInput = Double.parseDouble(input);

        float hours = (float) numberInput/60;
        float days = (float) ((numberInput/60)/24);
        System.out.println(numberInput + " minutes equals: "+hours +
                " hours or " + days+
                " days");

    }
}