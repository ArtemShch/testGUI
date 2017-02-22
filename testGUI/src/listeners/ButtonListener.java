package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton)
        {
            JButton button = (JButton) e.getSource();
            System.out.println("button.getName() = " + button.getText());
        }
    }
}
