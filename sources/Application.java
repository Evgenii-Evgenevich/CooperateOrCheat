/**
 * Created by EE on 24.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application implements ActionListener {
    private boolean started = false;

    static private final String description = "\tThe system has N-agents. Each agent has a starting amount of money M coins. " +
            "Agents can interact with each other in the following scenario: \n" +
            "\tAt the beginning of the game, each agent puts zero or one coin on the stake. " +
            "Opponents do not see how many coins each of them put. Then the following happens: \n" +
            "\t1. If both put on a coin then both get two. \n" +
            "\t2. If both do not put coins then each is fined for one coin. \n" +
            "\t3. If one of the players put a coin and the other does not " +
            "then the player who puts the coin is fined one " +
            "and the player who does not put the coin gets three. \n" +
            "\tThe agents can be different strategies. \n" +
            "\tTo take the rounds of the game in which each agent plays with each. " +
            "At the end of a round the agents with a negative amount in the account die. " +
            "If less than two agents, the game ends.";

    private MainFrame mainFrame = null;

    private JTextArea mainText = null;

    private MyPanelTextField getNumAgentsField = null;

    private MyPanelTextField getNumCoinsField = null;

    private JButton submitButton = null;

    public Application() {
        float fontSize = 18f;

        this.mainFrame = new MainFrame("cooperate or cheat", 640, 480);

        this.mainText = new JTextArea(this.description);
        this.mainText.setTabSize(4);
        this.mainText.setLineWrap(true);
        this.mainText.setWrapStyleWord(true);
        this.mainText.setBounds(0,0,620,1);
        this.mainText.setFont(this.mainText.getFont().deriveFont(fontSize));

        this.mainFrame.addComponent(this.mainText);

        this.getNumAgentsField = new MyPanelTextField("the number of starting agents ", fontSize, 10);

        this.mainFrame.addComponent(this.getNumAgentsField);

        this.getNumCoinsField = new MyPanelTextField("the number of starting coins ", fontSize, 1);

        this.mainFrame.addComponent(this.getNumCoinsField);

        this.submitButton = new JButton("game");
        this.submitButton.addActionListener(this);

        this.submitButton.setFont(this.submitButton.getFont().deriveFont(fontSize));

        this.mainFrame.addComponent(submitButton);

        this.mainFrame.setVisible(true);
        this.started = false;
    }

    public void actionPerformed(ActionEvent e) {
        if (!this.started) {
            this.getNumAgentsField.setVisible(false);
            this.getNumCoinsField.setVisible(false);
            this.submitButton.setVisible(false);

            this.mainText.setText("\tThe naive strategy: always put a coin on the stake hoping to get two " +
                    "if the opponent does the same (CooperatorAgent)\n" +
                    "\tThe greedy strategy: never put coins hoping to get three " +
                    "if the opponent does the opposite (CheaterAgent)\n" +
                    "\tThe random strategy: randomly put coins (MonkeyAgent)\n" +
                    "\tThe imitation strategy: at the first step put coin on the stake " +
                    "and next copy the previous step of the opponent (CopyistAgent)\n" +
                    "\n");

            System.out.println("getNumAgentsField " + this.getNumAgentsField.getFieldValue());
            System.out.println("getNumCoinsField " + this.getNumCoinsField.getFieldValue());

            // ????
            OneGame game = new OneGame(
                    getNumAgentsField.getFieldValue(),
                    0,
                    0,
                    0,
                    getNumCoinsField.getFieldValue()
            );

            this.started = true;

            do {
                game.round();
            } while (game.endRound() > 1);

            this.mainText.setText(game.agents.get(0).getStrategy());
        }
    }
}
