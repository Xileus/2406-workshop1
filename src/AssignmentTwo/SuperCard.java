package AssignmentTwo;

/**
 * Created by Xileus on 28/09/2016.
 */
public class SuperCard extends Card {
    protected String category;
    SuperCard(String image, String name, String category){
        super(image, name, true);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

}
