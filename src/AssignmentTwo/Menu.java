package AssignmentTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * Created by Xileus on 20/10/2016.
 */
public class Menu extends JMenuBar {
    JMenu menu;
    Menu(){
        menu = new JMenu("Game");
        JMenuItem newGame = new JMenuItem("New Game");
        menu.add(newGame);
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.reset();
            }
        });
        JMenuItem instructions = new JMenuItem("Instructions");
        instructions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        menu.add(instructions);
        add(menu);
    }
}
