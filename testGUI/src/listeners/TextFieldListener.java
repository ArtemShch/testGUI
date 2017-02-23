package listeners;

import GUI.MyJTextArea;
import GUI.MyJTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldListener implements ActionListener {
    private MyJTextArea textArea;

    public TextFieldListener(MyJTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof MyJTextField))
        {
            return;
        }
        JTextField textField = (JTextField) e.getSource();

        String number = textField.getText();
        if (!number.matches("-?\\d+(\\.\\d+)?"))
        {
            textField.setText("");
            return;
        }

        if (textArea.getText().isEmpty() || textArea.getText().split(" ").length == 2)
        {
            textArea.append(textField.getText() + " ");
            textField.setText("");
        }
        else
        {
            textField.setText("");
        }
    }
}
