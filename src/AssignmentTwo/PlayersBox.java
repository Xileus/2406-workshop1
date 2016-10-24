package AssignmentTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

/**
 * Created by Xileus on 20/10/2016.
 */
public class PlayersBox implements ActionListener {
    int players;
    JFrame frame;
    ArrayList<JButton> buttons = new ArrayList<>();
    PlayersBox(){
        frame = new JFrame("Super Trumps");
        Container buttonContainer = frame.getContentPane();
        int playerNumber = 3;
        for (int i=0; i<7; i++){
            if (i%2 == 0&&i!=0) {
                JButton button = new JButton("" + playerNumber);
                button.addActionListener(this);
                buttons.add(button);
                buttonContainer.add(button);
                playerNumber++;
            }else{
                if (playerNumber == 3&&i!=0){
                    JPanel j = new JPanel();
                    JLabel n = new JLabel("How many Players?");
                    j.setLayout(new GridLayout(1,3));
                    j.add(new JLabel());
                    j.add(n);
                    j.add(new JLabel());


                    buttonContainer.add(j);
                }else {
                    buttonContainer.add(new JLabel());
                }
            }
        }
        buttonContainer.setLayout(new GridLayout(7, 3));
        frame.pack();
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        players = Integer.parseInt(((JButton) e.getSource()).getText());
        frame.setVisible(false);
        Field field = new Field(players);
    }

    public int getPlayers() {
        return players;
    }
}
