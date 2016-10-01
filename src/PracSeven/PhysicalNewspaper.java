package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class PhysicalNewspaper extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int i=0;
        for (int j=0;j<address.length();j++){
            for (int k = 0;k<numbers.length;k++){
                try{
                    if (address.charAt(j) == numbers[k]){
                        i=1;
                    }
                } catch (Exception e){

                }
            }
        }
        if (i == 1){
            this.address = address;
            rate = 15;
        }else {
            System.out.println("Invalid address");
            rate = 0;
            this.address = null;
        }
    }

    @Override
    public String toString() {
        return name + "'s Newspapers to be delivered to "+address+" payment is $"+rate;
    }
}
