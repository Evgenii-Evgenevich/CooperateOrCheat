/**
 * Created by EE on 23.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.text.*;

public class MyPanelTextField extends JPanel implements ActionListener {
    public int gettingValue = 0;

    private JLabel label = null;

    private JFormattedTextField field = null;

    public MyPanelTextField(String labelText, float fontSize, int startingValue) {
        super();

        this.gettingValue = startingValue;

        this.label = new JLabel(labelText);

        this.field = new JFormattedTextField();
        this.field.setValue(new Integer(startingValue));
        this.field.setColumns(10);
        this. field.setFont(field.getFont().deriveFont(fontSize));
        this.field.addActionListener(this);

        this.label.setLabelFor(field);
        this.label.setFont(label.getFont().deriveFont(fontSize));

        this.add(label);
        this.add(field);
    }

    public void actionPerformed(ActionEvent e) {
        this.gettingValue = ((Integer)this.field.getValue()).intValue();
    }

    public int getValue() {
        return ((Integer)field.getValue()).intValue();
    }
}
