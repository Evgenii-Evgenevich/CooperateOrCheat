/**
 * Created by EE on 23.09.2017.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.text.*;

public class MyPanelTextField extends JPanel {

    private JLabel label = null;

    private JFormattedTextField field = null;

    public MyPanelTextField(String labelText, int startingValue) {
        super();

        label = new JLabel(labelText);

        field = new JFormattedTextField();
        field.setValue(new Integer(startingValue));
        field.setColumns(10);
        field.setFont(field.getFont().deriveFont(18f));

        label.setLabelFor(field);
        label.setFont(label.getFont().deriveFont(18f));

        this.add(label);
        this.add(field);
    }

    public int getValue() {
        return ((Integer)field.getValue()).intValue();
    }
}
