package PracThree;

/**
 * Created by Xileus on 15/08/2016.
 */
public class FormLetterWriter {
    public static void displaySalutation(String lastname){
        System.out.println("Dear Mr. or Mrs "+ lastname);
        done();
    }
    public static void displaySalutation(String first, String last){
        System.out.println("Dear " + first +" " +last);
        done();
    }

    private static void done() {
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args) {
        displaySalutation("Konovalov");
        displaySalutation("Dimitry", "Konovalov");
    }
}
