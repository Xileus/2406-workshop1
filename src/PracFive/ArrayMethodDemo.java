package PracFive;

/**
 * Created by Xileus on 5/09/2016.
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length;i++){
            array[i]=i;
        }
        displayAll(array);
        displayBackwards(array);
        displaySum(array);
        displayAllLess(array, 6);
        displayAllHigherThanAverage(array);
    }

    private static void displayAllHigherThanAverage(int[] array) {
        int t =0, a=0;
        for (int i:array) {
            t+=array[i];
        }
        a = t/array.length;
        for (int i:array
             ) {
            if (array[i]<a){
                System.out.printf(array[i]+" ");
            }
        }
        System.out.println();
    }

    private static void displayAllLess(int[] array, int i) {
        for (int j:array) {
            if (array[j] < i){
                System.out.printf(array[j]+" ");
            }
        }
        System.out.println();
    }

    private static void displaySum(int[] array) {
        int t=0;
        for (int i:array) {
            t += array[i];
        }
        System.out.printf(t+"\n");
    }

    private static void displayBackwards(int[] array) {
        for (int i:array) {
            System.out.printf(array[array.length-i-1]+" ");
        }
        System.out.println();
    }

    private static void displayAll(int[] array) {
        for (int i:array) {
            System.out.printf(array[i]+" ");
        }
        System.out.println();
    }
}
