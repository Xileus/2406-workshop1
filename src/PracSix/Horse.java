package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class Horse {
    protected String name;
    protected String colour;
    protected int birthYear;

    public int getBirthYear() {
        return birthYear;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }
}
