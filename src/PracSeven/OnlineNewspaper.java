package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class OnlineNewspaper extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        int i=0;
        for (int j=0;j<address.length();j++){

            if (address.charAt(j) == '@'){
                i=1;
            }
        }
        if (i == 1){
            this.address = address;
            rate = 9;
        }else {
            System.out.println("Invalid address");
            rate = 0;
            this.address = null;
        }
    }

    @Override
    public String toString() {
        return name + "'s Online subscription to be emailed to "+ address+" payment is $"+rate;
    }
}
