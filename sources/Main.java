/**
 * Created by EE on 23.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Main application = new Main();
    }

    private MainFrame mainFrame = null;

    private JTextArea mainText = null;

    private MyPanelTextField getNumAgentsField = null;

    private MyPanelTextField getNumCoinsField = null;

    private JButton submitButton = null;

    private Main() {
        mainFrame = new MainFrame("cooperate or cheat", 640, 480);

        mainText = new JTextArea("\tThe Game of Cooperation.\n\n" +
                "   The system has N-agents. Each agent has a starting amount of money M coins.\n" +
                "Agents can interact with each other in the following scenario:\n" +
                "   At the beginning of the game, each agent puts either zero or one coin on the stake.\n" +
                "Opponents do not see how many coins each of them put. Then the following happens:\n" +
                "   1. If both are put on a coin, then both get two.\n" +
                "   2. If both do not put coins, then each is penalized for one coin.\n" +
                "   3. If one of the players has put a coin and the other does not,\n" +
                "      then the player who puts the coin is fined one,\n" +
                "      and the player who does not put the coin gets three.");

        mainText.setFont(mainText.getFont().deriveFont(16f));

        mainFrame.addComponent(mainText);

        getNumAgentsField = new MyPanelTextField("the number of starting agents ");

        mainFrame.addComponent(getNumAgentsField);

        getNumCoinsField = new MyPanelTextField("the number of starting coins ");

        mainFrame.addComponent(getNumCoinsField);

        submitButton = new JButton("submit");

        submitButton.setFont(submitButton.getFont().deriveFont(48f));

        mainFrame.addComponent(submitButton);

        mainFrame.setVisible(true);
    }
}



