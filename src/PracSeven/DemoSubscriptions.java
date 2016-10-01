package PracSeven;

/**
 * Created by Xileus on 15/09/2016.
 */
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaper physicalNewspaper = new PhysicalNewspaper();
        OnlineNewspaper onlineNewspaper = new OnlineNewspaper();
        physicalNewspaper.setAddress("asjdhakjs 2 asf");
        onlineNewspaper.setAddress("adslkj@aldkjs");
        System.out.println(onlineNewspaper + "\n" + physicalNewspaper);
    }
}
