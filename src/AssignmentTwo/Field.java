package AssignmentTwo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Xileus on 20/10/2016.
 */
public class Field extends JFrame {
    Field field = this;
    JPanel bottom;
    JPanel top;
    JScrollPane scrollPane;
    JPanel contentPane;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    ArrayList<Card> hand = new ArrayList<>();
    ArrayList<Card> AIOne = new ArrayList<>();
    ArrayList<Card> AITwo = new ArrayList<>();
    ArrayList<Card> AIThree = new ArrayList<>();
    ArrayList<Card> AIFour = new ArrayList<>();
    JLabel current;
    JLabel played;
    int players;
    boolean win = false;

    Field(int players){
        Field(players);
    }

    public void Field(int p){
        players = p;
        PlayersBox playersBox = new PlayersBox();
        players = playersBox.getPlayers();
        setTitle("Super Trumps");
        Deck cards = new Deck();
        cards.Shuffle();
        cards.Deal(hand);
        DealAI(cards);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        GridLayout layout = new GridLayout(2, 1);
        setLayout(layout);
        Menu menu = new Menu();
        setJMenuBar(menu);
        top = new JPanel();
        bottom = new JPanel();
        bottom.setBackground(Color.darkGray);
        top.setBackground(Color.darkGray);
        top.setLayout(new GridLayout(1, 3));



        current = new JLabel((new ImageIcon(getEmptyCard())));
        played = new JLabel((new ImageIcon(getEmptyCard())));
        JLabel deck = new JLabel((new ImageIcon(getBackCard())));


        deck.addMouseListener(new MouseListener() {
                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        if (!win){
                                            remove(contentPane);
                                            contentPane.removeAll();
                                            cards.Pass(hand);
                                            setHand(hand);
                                            contentPane.revalidate();
                                            add(contentPane);
                                            revalidate();
                                        } else{
                                            JOptionPane.showMessageDialog(field, "Please start a new game");
                                        }
                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {

                                    }
                                });

        top.add(current);
        top.add(played);
        top.add(deck);
        add(top);
        setHand(hand);
        add(contentPane);


        pack();
        setVisible(true);
    }

    private void DealAI(Deck cards) {
        if (players == 3){
            cards.Deal(AIOne);
            cards.Deal(AITwo);
        } else if (players == 4){
            cards.Deal(AIOne);
            cards.Deal(AITwo);
            cards.Deal(AIThree);
        } else {
            cards.Deal(AIOne);
            cards.Deal(AITwo);
            cards.Deal(AIThree);
            cards.Deal(AIFour);
        }
    }

    void setHand(ArrayList<Card> hand){
        bottom.removeAll();

        for (int i=0;i<hand.size();i++){
            Image cImage = hand.get(i).getImage();
            JLabel card = new JLabel();
            int finalI = i;
            card.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (!win) {
                        PlayCard(e, hand, finalI);
                        remove(contentPane);
                        contentPane.removeAll();
                        setHand(hand);
                        contentPane.revalidate();
                        add(contentPane);
                        revalidate();
                        if (hand.size() == 0) {
                            Win("Player");
                        }
                    }else {
                        JOptionPane.showMessageDialog(field, "Please start a new game");
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    PlayingCard(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            card.setIcon(new ImageIcon(cImage));
            bottom.add(card);

        }


        scrollPane = new JScrollPane(bottom);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(50);


        scrollPane.setBounds(0, 0, screenSize.width, ((screenSize.height-80)/2));
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(2100, 500));
        contentPane.add(scrollPane);


    }

    private void Win(String player) {
        win = true;
        JOptionPane.showMessageDialog(this, player + "Wins!");
    }

    private void PlayCard(MouseEvent e, ArrayList<Card> hand, int i) {

        current.setIcon(((JLabel) e.getSource()).getIcon());
        hand.remove(i);
    }
    private void PlayingCard(MouseEvent e){

        played.setIcon(((JLabel) e.getSource()).getIcon());
    }

    public Image getBackCard() {
        BufferedImage image;
        try{
            image = ImageIO.read(new File("src\\AssignmentTwo\\images\\Slide65.jpg"));
        }catch (IOException e){
            image = null;
        }
        Image backCard = image.getScaledInstance(350,500, Image.SCALE_DEFAULT);

        return backCard;
    }

    public Image getEmptyCard() {
        BufferedImage image;
        try{
            image = ImageIO.read(new File("src\\AssignmentTwo\\images\\Slide66.jpg"));
        }catch (IOException e){
            image = null;
        }
        Image emptyCard = image.getScaledInstance(350,500, Image.SCALE_DEFAULT);

        return emptyCard;
    }

    public void reset(int players) {
        removeAll();
        Field(players);
        revalidate();
    }
}
