package Assignment;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.*;

/**
 * Created by Xileus on 28/09/2016.
 */
public class Deck {
    ArrayList<Card> deck = new ArrayList<>();
    Deck(){
        Deck();
    }
    public void Deck(){
        try {
            File fXmlFile = new File("src\\Assignment\\cards.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("pCard");
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    Card card;
                    if (eElement.getElementsByTagName("card_type").item(0).getTextContent().equals("play")){
                        card = new MineralCard(eElement.getElementsByTagName("fileName").item(0).getTextContent(),
                                eElement.getElementsByTagName("title").item(0).getTextContent(),
                                eElement.getElementsByTagName("chemistry").item(0).getTextContent(),
                                eElement.getElementsByTagName("classification").item(0).getTextContent(),
                                eElement.getElementsByTagName("crystal_system").item(0).getTextContent(),
                                eElement.getElementsByTagName("occurrence").item(0).getTextContent(),
                                eElement.getElementsByTagName("hardness").item(0).getTextContent(),
                                eElement.getElementsByTagName("specific_gravity").item(0).getTextContent(),
                                eElement.getElementsByTagName("cleavage").item(0).getTextContent(),
                                eElement.getElementsByTagName("crustal_abundance").item(0).getTextContent(),
                                eElement.getElementsByTagName("economic_value").item(0).getTextContent());
                    }else{
                        card = new SuperCard(eElement.getElementsByTagName("fileName").item(0).getTextContent(),
                                eElement.getElementsByTagName("title").item(0).getTextContent(),
                                eElement.getElementsByTagName("subtitle").item(0).getTextContent());
                    }
                    deck.add(card);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Shuffle(){
        Collections.shuffle(deck);
    }

    public void Deal(ArrayList<Card> hand) {
        hand.clear();
        for(int i=0; i<8;i++){
            hand.add(deck.get(i));
            deck.remove(i);
        }
    }
    public void Pass(ArrayList<Card> hand, String player){
        if (deck.size() == 0){
            this.Deck();
        }else{
        hand.add(deck.get(0));
        deck.remove(0);
        System.out.println(player + " passed");
        }
    }
}