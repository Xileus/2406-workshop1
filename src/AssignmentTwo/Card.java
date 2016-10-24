package AssignmentTwo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

    public Image getImage() {
        BufferedImage image;
        try{
            image = ImageIO.read(new File("src\\AssignmentTwo\\images\\" + this.image));
        }catch (IOException e){
            image = null;
        }
        Image scaledImage = image.getScaledInstance(350,500, Image.SCALE_DEFAULT);

        return scaledImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTrump() {
        return trump;
    }


}
