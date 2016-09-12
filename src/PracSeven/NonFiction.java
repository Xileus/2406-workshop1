package PracSeven;

/**
 * Created by Xileus on 12/09/2016.
 */
public class NonFiction extends Book {
    NonFiction(String title){
        super(title);
        price = 37.99;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
