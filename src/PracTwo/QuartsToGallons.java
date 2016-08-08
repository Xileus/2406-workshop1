package PracTwo;

/**
 * Created by Xileus on 8/08/2016.
 */
public class QuartsToGallons {
    public static void main(String[] args) {
        int quartsInGallon = 4;
        int quarts = 18;
        int remainder = quarts % quartsInGallon;
        int requiredQuarts = quarts/quartsInGallon;
        System.out.println("A job that needs " +quarts + " quarts requires "+ requiredQuarts+" gallons plus "+ remainder + " quarts");
    }
}
