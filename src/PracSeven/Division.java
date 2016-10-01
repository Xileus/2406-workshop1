package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
abstract public class Division {
    protected String divisionName;
    protected int accountNumber;
    Division(String divisionName, int accountNumber){
        this.accountNumber = accountNumber;
        this.divisionName = divisionName;
    }
    abstract protected void display();
}
