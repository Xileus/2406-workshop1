package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class InternationalDivision extends Division {
    private String country;
    InternationalDivision(String divisonName, int accountNumber, String country){
        super(divisonName, accountNumber);
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected void display() {

    }
}
