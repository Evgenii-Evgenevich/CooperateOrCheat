/**
 * Created by EE on 24.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application implements ActionListener {

    static private final String description = "\tThe system has N-agents. Each agent has a starting amount of money M coins. " +
            "Agents can interact with each other in the following scenario: \n" +
            "\tAt the beginning of the game, each agent puts zero or one coin on the stake. " +
            "Opponents do not see how many coins each of them put. Then the following happens: \n" +
            "\t1. If both put on a coin then both get two. \n" +
            "\t2. If both do not put coins then each is fined for one coin. \n" +
            "\t3. If one of the players put a coin and the other does not " +
            "then the player who puts the coin is fined one " +
            "and the player who does not put the coin gets three.";

    private MainFrame mainFrame = null;

    private JTextArea mainText = null;

    private MyPanelTextField getNumAgentsField = null;

    private MyPanelTextField getNumCoinsField = null;

    private JButton submitButton = null;

    public Application() {
        float fontSize = 18f;

        mainFrame = new MainFrame("cooperate or cheat", 640, 480);

        mainText = new JTextArea(description);
        mainText.setTabSize(4);
        mainText.setLineWrap(true);
        mainText.setWrapStyleWord(true);
        mainText.setBounds(0,0,620,1);
        mainText.setFont(mainText.getFont().deriveFont(fontSize));

        mainFrame.addComponent(mainText);

        getNumAgentsField = new MyPanelTextField("the number of starting agents ", fontSize, 10);

        mainFrame.addComponent(getNumAgentsField);

        getNumCoinsField = new MyPanelTextField("the number of starting coins ", fontSize, 1);

        mainFrame.addComponent(getNumCoinsField);

        submitButton = new JButton("game");
        submitButton.addActionListener(this);

        submitButton.setFont(submitButton.getFont().deriveFont(fontSize));

        mainFrame.addComponent(submitButton);

        mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
