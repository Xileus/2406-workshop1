package PracSeven;

/**
 * Created by Xileus on 12/09/2016.
 */
public class Fiction extends Book {
    Fiction(String title){
        super(title);
        setPrice(24.99);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
