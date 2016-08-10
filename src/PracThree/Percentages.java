package PracThree;

/**
 * Created by Xileus on 10/08/2016.
 */
public class Percentages {
    public static void main(String[] args) {
        double a = 5, b = 2;
        computePercent(a, b);
        computePercent(b, a);
    }

    private static void computePercent(double a, double b) {
        double percent = (a/b)*100;
        System.out.println(a + " is " + percent + "% of " + b);
    }
}
