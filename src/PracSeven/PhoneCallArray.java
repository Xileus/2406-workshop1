package PracSeven;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by Xileus on 15/09/2016.
 */
public class PhoneCallArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(10)+1;
        double time = 10 * rand.nextDouble();
        String phoneNumber = null;
        PhoneCall[] calls = new PhoneCall[10];

        for (int j=0;j<calls.length;j++) {
            if (i % 2 == 0){
                calls[j] = new IncomingCall(phoneNumber);
            } else{
                calls[j] = new OutgoingCall(phoneNumber, time);
            }
            i = rand.nextInt(10) +1;
        }

        for (PhoneCall call:calls) {
            System.out.println(call);
            System.out.println();
        }
    }
}
