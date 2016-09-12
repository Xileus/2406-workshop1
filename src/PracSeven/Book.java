package PracSeven;

/**
 * Created by Xileus on 12/09/2016.
 */
abstract public class Book {
    protected String title;
    protected double price;
    Book(String title){
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Price: $" + price;
    }

    abstract public void setPrice(double price);
}
