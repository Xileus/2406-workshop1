package AssignmentTwo;


import java.util.ArrayList;

/**
 * Created by Xileus on 20/10/2016.
 */
public class App{
    //-------------
    static String currentTrump;
    static float highestCard = -1f;
    static String highestCardPlayer;
    static int passes = 0;
    static int players;
    static Field field;
    //-------------
    static ArrayList<String> trumpTypes = new ArrayList<>();

    //-------------

    public static void main(String[] args) {
        trumpTypes.add("Hardness");
        trumpTypes.add("Specific gravity");
        trumpTypes.add("Cleavage");
        trumpTypes.add("Crustal abundance");
        trumpTypes.add("Economic value");
        //----------
        Deck cards;
        ArrayList<Card> firstPlayer = new ArrayList<>();
        ArrayList<Card> secondPlayer = new ArrayList<>();
        ArrayList<Card> thirdPlayer = new ArrayList<>();
        ArrayList<Card> fourthPlayer = new ArrayList<>();
        ArrayList<Card> fifthPlayer = new ArrayList<>();
        //-------------
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI();
            }
        });
    }

    static void GUI(){
        PlayersBox playersBox = new PlayersBox();
    }


    static void AITurn(){

    }
    static void reset(){
        PlayersBox playersBox = new PlayersBox();
    }
}
