package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingCall incomingCall = new IncomingCall("47241543");
        OutgoingCall outgoingCall = new OutgoingCall("0406992457", 9);
        System.out.println(outgoingCall + "\n" + incomingCall);
    }
}
