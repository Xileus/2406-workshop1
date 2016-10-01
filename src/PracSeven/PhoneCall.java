package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public abstract class PhoneCall {
    protected String phoneNumber;
    protected double price;
    protected double rate;
    PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        price = 0.0;
        rate = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract public String getPhoneNumber();
    abstract public double getPrice();

    abstract public double getRate();

    abstract public String toString();
}
