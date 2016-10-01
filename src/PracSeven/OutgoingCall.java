package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class OutgoingCall extends PhoneCall{
    private double minutes;
    OutgoingCall(String phoneNumber, double time){
        super(phoneNumber);
        minutes = time;
        rate = 0.04;
    }

    @Override
    public double getPrice() {
        setPrice(minutes * getRate());
        return price;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString() {
        return "Phone Number: " + getPhoneNumber() +"\n" +
                "Minutes: " + minutes + "\n" +
                "Rate: " + getRate() + "\n" +
                "Price: " + getPrice();
    }
}
