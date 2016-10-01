package Assignment;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Xileus on 28/09/2016.
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("p")){
            System.out.println("same 1");
        }
        if (input == "p"){
            System.out.println("same 2");
        }
    }
}
