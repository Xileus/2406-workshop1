package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class IncomingCall extends PhoneCall {
    IncomingCall(String phoneNumber){
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Phone Number: " + getPhoneNumber() +"\n" +
                "Rate: "+ getRate()+"\n" +
                "Price: "+getPrice();
    }
}
