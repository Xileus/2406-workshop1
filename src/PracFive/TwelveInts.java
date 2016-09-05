package PracFive;

/**
 * Created by Xileus on 5/09/2016.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i<array.length;i++){
            array[i] = i;
            System.out.printf(array[i]+" ");
        }
        System.out.println();
        for (int i:array) {
            System.out.printf(array[array.length-i-1]+" ");
        }
    }
}
