package Assignment;

import java.util.ArrayList;

/**
 * Created by Xileus on 28/09/2016.
 */
abstract public class Card {
    protected boolean trump;
    protected String name;
    protected String image;
    Card(String image, String name, boolean trump){
        this.name = name;
        this.image = image;
        this.trump = trump;

    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrump(boolean trump) {
        this.trump = trump;
    }

    public boolean isTrump() {
        return trump;
    }

    @Override
    abstract public String toString();

    abstract public String Line();

    protected static String RightPadding(String name, int longestName) {
        String rightPadding = "";
        int totalSpareChars = longestName - name.length();
        if (name.length() == longestName){
            rightPadding = "";
        } else {
            if (totalSpareChars %2 == 0){
                for (int i = 0; i<totalSpareChars/2;i++){
                    rightPadding += " ";
                }
            } else {
                for (int i = 0; i<totalSpareChars/2+1;i++){
                    rightPadding += " ";
                }
            }
        }
        return rightPadding;
    }
    protected static String LeftPadding(String name, int longestName) {
        String leftPadding = "";
        int totalSpareChars = longestName - name.length();
        if (name.length() == longestName){
            leftPadding = "";
        } else {
            for (int i = 0; i<totalSpareChars/2;i++){
                leftPadding += " ";
            }
        }

        return leftPadding;
    }
    public String DottedLine(String flatLine) {
        String line ="";
        for (int i=0; i<flatLine.length();i++){
            line += "-";
        }
        return line;
    }
}
