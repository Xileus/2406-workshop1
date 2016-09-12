package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class Poem {
    protected String name;
    protected int lines;

    Poem(String name, int lines){
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }
}
