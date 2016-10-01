package Assignment;

/**
 * Created by Xileus on 28/09/2016.
 */
public class SuperCard extends Card{
    protected String category;
    SuperCard(String image, String name, String category){
        super(image, name, true);
        this.category = category;
    }


    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        String flatLine = Line();
        String dottedLine = DottedLine(flatLine);
        String name = getName();
        String trump = getCategory();
        return flatLine+
                "\n|" + LeftPadding(name, flatLine.length()-2) + name + RightPadding(name, flatLine.length()-2) + "|\n" +
                dottedLine + "\n|" + (char)27 + "[4m" +
                LeftPadding(trump, flatLine.length()-2) + trump + RightPadding(trump, flatLine.length()-2)+ (char) 27 + "[0m|\n";
    }

    @Override
    public String Line() {
        String line = "";
        int length=0;
        int name = (getName()).length();
        int trump = ("Trump: " + getCategory()).length();
        if (name > length){
            length = name;
        }
        if (trump > length) {
            length = trump;
        }

        for (int i=0;i<length+2;i++){
            line += "_";
        }
        return line;
    }
}
