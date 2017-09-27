/**
 * Created by EE on 23.09.2017.
 */

import javax.swing.*;

public class MyPanelTextField extends JPanel {
    private JFormattedTextField field = null;

    public MyPanelTextField(String labelText, float fontSize, int startingValue) {
        super();

        JLabel label = new JLabel(labelText);
        label.setFont(label.getFont().deriveFont(fontSize));

        this.field = new JFormattedTextField();
        this.field.setFont(this.field.getFont().deriveFont(fontSize));
        this.field.setValue(new Integer(startingValue));
        this.field.setColumns(10);

        label.setLabelFor(this.field);

        this.add(label);
        this.add(this.field);
    }

    // gets the integer value from the text field
    public int getFieldValue() {
        return ((Integer)this.field.getValue()).intValue();
    }
}
