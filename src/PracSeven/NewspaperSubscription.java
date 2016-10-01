package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
abstract public class NewspaperSubscription {
    protected String name;
    protected String address;
    protected int rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    abstract public void setAddress(String address);

    public int getRate() {
        return rate;
    }


}
