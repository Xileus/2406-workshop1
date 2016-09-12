package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        candle.setColour("Pink");
        candle.setHeight(300);
        System.out.println(candle.getPrice());
        scentedCandle.setColour("Green");
        scentedCandle.setHeight(300);
        System.out.println(scentedCandle.getPrice());
    }
}
