package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {
    private JTextArea textArea;
    public ButtonListener(JTextArea textArea) {
        this.textArea = textArea;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton)
        {
            JButton button = (JButton) e.getSource();
            String buttonName = button.getText();
            textArea.append(buttonName + "\n");

            System.out.println("button.getName() = " + button.getText());
        }
    }
}
