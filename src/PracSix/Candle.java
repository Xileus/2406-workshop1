package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class Candle {
    protected String colour;
    protected float height;
    protected float price;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        price = height *2;
    }

    public float getPrice() {
        return price;
    }

}
