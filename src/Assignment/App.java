package Assignment;

import java.io.IOException;
import java.util.*;

/**
 * Created by Xileus on 28/09/2016.
 */
public class App {
    //-------------
    static String currentTrump;
    static float highestCard = 0.0f;
    static String highestCardPlayer;
    static int passes = 0;
    //-------------
    static ArrayList<String> trumpTypes = new ArrayList<>();

    //-------------

    public static void main(String[] args) throws IOException {
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
        Scanner scanner = new Scanner(System.in);
        //------------
        int inputInt = 0;
        String input;
        //------------
        System.out.println("Would you like to play \"Super Trumps\" (Y/N)?");
        input = scanner.next();
        //-------------
        while (true){
            //-------------------
            if (!input.equalsIgnoreCase("Y"))
                break;
            //-------------------
            cards = new Deck();
            cards.Shuffle();
            inputInt =0;
            //------------------
            while (inputInt == 0) {
                try {
                    System.out.println("How many players? (3-5)");
                    inputInt = scanner.nextInt();
                    if (inputInt <3 || inputInt > 5){
                        throw  new InputMismatchException();
                    }
                    //------------
                    if (inputInt == 3){
                        Play(cards, inputInt, firstPlayer, secondPlayer, thirdPlayer);
                    }else if (inputInt == 4){
                        Play(cards, inputInt, firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);
                    }else {
                        Play(cards, inputInt, firstPlayer, secondPlayer, thirdPlayer, fourthPlayer, fifthPlayer);
                    }
                    //------------

                } catch (InputMismatchException e){
                    System.out.println("Please enter a valid number");
                    scanner = new Scanner(System.in);
                    inputInt = 0;
                }
            }
            scanner = new Scanner(System.in);
            System.out.println("Would you like to play \"Super Trumps\" (Y/N)?");
            input = scanner.next();
        }
    }

    private static void DisplayHand(ArrayList<Card> hand) {

        int longestName = 0;
        for (Card card:hand) {
            if (longestName < card.getName().length()){
                longestName = card.getName().length();
            }
        }
        //--------------
        PrintLine(longestName, hand);
        for (int i = 0; i<hand.size();i++) {
            if (hand.get(i).isTrump()) {
                SuperCard card = (SuperCard) hand.get(i);
                String name = card.getName();
                String leftPadding = LeftPadding(name, longestName);
                String rightPadding = RightPadding(name, longestName);
                System.out.printf((char)27+"[4m|"+leftPadding+ name+ rightPadding + "|");
            } else {
                MineralCard card = (MineralCard) hand.get(i);
                String name = card.getName();
                String leftPadding = LeftPadding(name, longestName);
                String rightPadding = RightPadding(name, longestName);
                System.out.printf((char)27+"[4m|"+leftPadding+ name + rightPadding+ "|");
            }
            System.out.printf((char) 27 + "[0m\t");
        }
        //-------------

    }

    private static String RightPadding(String name, int longestName) {
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
    private static String LeftPadding(String name, int longestName) {
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

    private static void PrintLine(int longestName, ArrayList<Card> hand) {
        for (int i = 0; i<hand.size();i++){
            for (int j =0; j<longestName+2;j++){
                System.out.printf("_");
            }
            System.out.printf("\t");
        }
        System.out.println();
    }


    //--------------
    public static void Play(Deck cards, int players, ArrayList<Card> firstPlayer, ArrayList<Card> secondPlayer, ArrayList<Card> thirdPlayer){
        cards.Deal(firstPlayer);
        cards.Deal(secondPlayer);
        cards.Deal(thirdPlayer);
        //---------------------
        while (firstPlayer.size() != 0 && secondPlayer.size() != 0 && thirdPlayer.size() != 0){
            if(secondPlayer.size() != 0 && thirdPlayer.size() != 0)
                PlayerTurn(cards, players, firstPlayer, "First Player");
            if (firstPlayer.size() != 0 && thirdPlayer.size() != 0)
                AITurn(cards, players, secondPlayer, "Second Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0)
                AITurn(cards, players, thirdPlayer, "Third Player");
        }
    }

    public static void Play(Deck cards, int players, ArrayList<Card> firstPlayer, ArrayList<Card> secondPlayer, ArrayList<Card> thirdPlayer, ArrayList<Card> fourthPlayer){
        cards.Deal(firstPlayer);
        cards.Deal(secondPlayer);
        cards.Deal(thirdPlayer);
        cards.Deal(fourthPlayer);
        //----------------------
        while (firstPlayer.size() != 0 && secondPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0){
            if(secondPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0)
                PlayerTurn(cards, players, firstPlayer, "First Player");
            if (firstPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0)
                AITurn(cards, players, secondPlayer, "Second Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0 && fourthPlayer.size() != 0)
                AITurn(cards, players, thirdPlayer, "Third Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0 && thirdPlayer.size() != 0)
                AITurn(cards, players, fourthPlayer, "Fourth Player");
        }
    }

    public static void Play(Deck cards, int players, ArrayList<Card> firstPlayer, ArrayList<Card> secondPlayer, ArrayList<Card> thirdPlayer, ArrayList<Card> fourthPlayer, ArrayList<Card> fifthPlayer){
        cards.Deal(firstPlayer);
        cards.Deal(secondPlayer);
        cards.Deal(thirdPlayer);
        cards.Deal(fourthPlayer);
        cards.Deal(fifthPlayer);
        //---------------------
        while (firstPlayer.size() != 0 && secondPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0 && fifthPlayer.size() != 0){
            if(secondPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0 && fifthPlayer.size() != 0)
                PlayerTurn(cards, players, firstPlayer, "First Player");
            if (firstPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0 && fifthPlayer.size() != 0)
                AITurn(cards, players, secondPlayer, "Second Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0 && fourthPlayer.size() != 0 && fifthPlayer.size() != 0)
                AITurn(cards, players, thirdPlayer, "Third Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0 && thirdPlayer.size() != 0 && fifthPlayer.size() != 0)
                AITurn(cards, players, fourthPlayer, "Fourth Player");
            if (secondPlayer.size() != 0 && firstPlayer.size() != 0 && thirdPlayer.size() != 0 && fourthPlayer.size() != 0)
                AITurn(cards, players, fifthPlayer, "Fifth Player");
        }
    }

    //--------------
    public static void AITurn(Deck cards, int players, ArrayList<Card> hand, String player){
        String currentTrump = getCurrentTrump();
        String cardToPlay = null;
        float currentHigh = getHighestCard();
        //---------
        ArrayList<MineralCard> mineralCards = new ArrayList<>();
        ArrayList<SuperCard> trumps = new ArrayList<>();
        //---------
        for (Card card:hand) {
            if (card.isTrump()){
                trumps.add((SuperCard) card);
            } else {
                mineralCards.add((MineralCard) card);
            }
        }
        //-----
        if (!(currentTrump == null))
        for (MineralCard card:mineralCards) {
            if (currentTrump.equalsIgnoreCase("Hardness")){
                if (card.getHardness()>currentHigh){
                    cardToPlay = card.getName();
                }
            } else if (currentTrump.equalsIgnoreCase("Specific gravity")){
                if (card.getSpecificGravity()>currentHigh){
                    cardToPlay = card.getName();
                }
            } else if (currentTrump.equalsIgnoreCase("Cleavage")){
                if (card.getCleavage()>currentHigh){
                    cardToPlay = card.getName();
                }
            } else if (currentTrump.equalsIgnoreCase("Crustal abundance")){
                if (card.getCrustalAbundance()>currentHigh){
                    cardToPlay = card.getName();
                }
            } else if (currentTrump.equalsIgnoreCase("Economic value")) {
                if (card.getEconomicValue()>currentHigh){
                    cardToPlay = card.getName();
                }
            }
        }
        else
            trumps.clear();
        //-----
        if (cardToPlay == null&&trumps.size()!=0){

                PlayTrumpCard(trumps.get(0).getName(), hand, player);
                passes = 0;
        } else if (cardToPlay == null&&trumps.size()==0){
             if (passes == players-1 || currentTrump == null) {
                passes = 0;
                Collections.shuffle(trumpTypes);
                if (currentTrump == null){
                    while (trumpTypes.get(0) == currentTrump){
                        Collections.shuffle(trumpTypes);
                    }
                }
                Collections.shuffle(mineralCards);
                cardToPlay = mineralCards.get(0).getName();
                System.out.println(player + " has changed the trump to " + trumpTypes.get(0));
                PlayMineralCard(cardToPlay, hand, player, trumpTypes.get(0));
            } else {
                cards.Pass(hand, player);
                passes++;
            }
        } else {
            passes = 0;
            PlayMineralCard(cardToPlay, hand, player, currentTrump);
        }


    }

    public static void PlayerTurn(Deck cards, int players, ArrayList<Card> hand, String player){
        Scanner scanner = new Scanner(System.in);
        DisplayHand(hand);
        ArrayList<MineralCard> mineralCards = new ArrayList<>();
        ArrayList<SuperCard> superCards = new ArrayList<>();
        String currentTrump = getCurrentTrump();
        for (Card card:hand){
            if (card.isTrump()){
                superCards.add((SuperCard) card);
            } else{
                mineralCards.add((MineralCard) card);
            }
        }
        System.out.println("\nSelect a card to see better details, or press N to play a card");
        String input = scanner.nextLine();
        sys:while (true){
            if (input.equalsIgnoreCase("n")){
                scanner = new Scanner(System.in);
                System.out.println("Enter the card you wish to play or press P to pass:");
                input = scanner.nextLine();
                isACard:while (true){
                    for (Card card:hand) {
                        if (card.getName().equalsIgnoreCase(input) || input.equalsIgnoreCase("p")){
                            break isACard;
                        }
                    }
                    scanner = new Scanner(System.in);
                    System.out.println("Enter the card you wish to play or press P to pass:");
                    input = scanner.nextLine();
                }
                if ((input.equalsIgnoreCase("P"))) {
                    if (passes == players-1){
                        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that");
                        currentTrump = null;
                    } else {
                        passes++;
                        cards.Pass(hand, player);
                        break sys;
                    }
                } else {

                    if (currentTrump == null) {
                        passes = 0;
                        for (SuperCard card: superCards){
                            if (card.getName().equalsIgnoreCase(input)){
                                PlayTrumpCard(card.getName(), hand, player);
                                break sys;
                            }
                        }

                        String newTrump;
                        scanner = new Scanner(System.in);
                        System.out.println("Enter new trump");
                        newTrump = scanner.nextLine();

                        while(!NotTrump(newTrump)){
                            System.out.println("Invalid Trump\nEnter new trump");
                            newTrump = scanner.nextLine();
                        }
                        for (MineralCard card:mineralCards){
                            if (card.getName().equalsIgnoreCase(input)){
                                PlayMineralCard(card.getName(), hand, player, newTrump);
                                break sys;
                            }
                        }

                    } else {
                        passes = 0;
                        float currentHigh = getHighestCard();
                        mineralCard:for (MineralCard card:mineralCards){
                            if (card.getName().equalsIgnoreCase(input)){
                                if (currentTrump.equalsIgnoreCase("Hardness")){
                                    if (card.getHardness()>currentHigh){
                                        PlayMineralCard(card.getName(), hand, player, currentTrump);
                                    }else {
                                        System.out.println("Value is lower than the current");
                                        break mineralCard;
                                    }
                                } else if (currentTrump.equalsIgnoreCase("Specific gravity")){
                                    if (card.getSpecificGravity()>currentHigh){
                                        PlayMineralCard(card.getName(), hand, player, currentTrump);
                                    }else {
                                        System.out.println("Value is lower than the current");
                                        break mineralCard;
                                    }
                                } else if (currentTrump.equalsIgnoreCase("Cleavage")){
                                    if (card.getCleavage()>currentHigh){
                                        PlayMineralCard(card.getName(), hand, player, currentTrump);
                                    }else {
                                        System.out.println("Value is lower than the current");
                                        break mineralCard;
                                    }
                                } else if (currentTrump.equalsIgnoreCase("Crustal abundance")){
                                    if (card.getCrustalAbundance()>currentHigh){
                                        PlayMineralCard(card.getName(), hand, player, currentTrump);
                                    }else {
                                        System.out.println("Value is lower than the current");
                                        break mineralCard;
                                    }
                                } else if (currentTrump.equalsIgnoreCase("Economic value")) {
                                    if (card.getEconomicValue()>currentHigh){
                                        PlayMineralCard(card.getName(), hand, player, currentTrump);
                                    }else {
                                        System.out.println("Value is lower than the current");
                                        break mineralCard;
                                    }
                                }

                                break sys;
                            }
                        }
                        for (SuperCard card: superCards){
                            if (card.getName().equalsIgnoreCase(input)){
                                PlayTrumpCard(card.getName(), hand, player);
                                break sys;
                            }
                        }
                    }
                }
            } else {
                for (Card card: hand){
                    if (card.getName().equalsIgnoreCase(input)){
                        System.out.println(card);
                    }
                }
            }
            DisplayHand(hand);
            System.out.println("\nSelect a card to see better details, or press N to play a card");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }


    }
    //----------
    public static void PlayTrumpCard(String card, ArrayList<Card> hand, String player){
        String newTrump;
        setHighestCard(0.0f);
        for (int i = 0; i<hand.size();i++){
            if (hand.get(i).getName() == card){

                SuperCard playedCard = (SuperCard) hand.get(i);
                if (!card.equalsIgnoreCase("The Geologist")) {
                    newTrump = playedCard.getCategory();
                    setCurrentTrump(newTrump);
                } else {
                    if (!player.equalsIgnoreCase("First Player")){
                        Collections.shuffle(trumpTypes);
                        newTrump = trumpTypes.get(0);
                        setCurrentTrump(newTrump);
                    } else {
                        Scanner scanner;
                        scanner = new Scanner(System.in);
                        System.out.println("Enter new trump");
                        newTrump = scanner.nextLine();

                        while(!NotTrump(newTrump)){
                            System.out.println("Invalid Trump\nEnter new trump");
                            newTrump = scanner.nextLine();
                        }
                    }
                }
                System.out.println(player + " played " + playedCard.getName() + " and changed the Trump to " + newTrump);
                hand.remove(i);
            }
        }
        Win(hand, player);
    }

    private static void Win(ArrayList<Card> hand, String player) {
        if (hand.size() == 0){
            System.out.println(player + " Wins!\n");
            setCurrentTrump(null);
            setHighestCard(0.0f);
            setHighestCardPlayer(null);
        }
    }

    public static void PlayMineralCard(String card, ArrayList<Card> hand, String player, String category){
        setHighestCardPlayer(player);
        setCurrentTrump(category);
        for (int i = 0; i<hand.size();i++){
            if (hand.get(i).getName() == card){
                MineralCard playedCard = (MineralCard) hand.get(i);
                if (category.equalsIgnoreCase("Hardness")){
                    setHighestCard(playedCard.getHardness());
                } else if (category.equalsIgnoreCase("Specific gravity")){
                    setHighestCard(playedCard.getSpecificGravity());
                } else if (category.equalsIgnoreCase("Cleavage")){
                    setHighestCard(playedCard.getCleavage());
                } else if (category.equalsIgnoreCase("Crustal abundance")){
                    setHighestCard(playedCard.getCrustalAbundance());
                } else if (category.equalsIgnoreCase("Economic value")) {
                    setHighestCard(playedCard.getEconomicValue());
                }
                System.out.println(player + " played " + playedCard.getName() + " highest value is now " + getHighestCard());
                hand.remove(i);
            }
        }

        Win(hand, player);
    }
    public static boolean NotTrump(String trump){
        boolean isTrump = false;
        for (String string:trumpTypes){
            if (trump.equalsIgnoreCase(string)){
                isTrump = true;
                break;
            }
        }
        return isTrump;
    }
    //----------

    public static float getHighestCard() {
        return highestCard;
    }

    public static String getCurrentTrump() {
        return currentTrump;
    }

    public static void setCurrentTrump(String currentTrump) {
        App.currentTrump = currentTrump;
    }

    public static void setHighestCard(float highestCard) {
        App.highestCard = highestCard;
    }

    public static void setHighestCardPlayer(String highestCardPlayer) {
        App.highestCardPlayer = highestCardPlayer;
    }
}