package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
            int expressionSize = textArea.getText().split(" ").length;
            if(!textArea.getText().isEmpty() && expressionSize == 1)
            {
                textArea.append(buttonName + " ");
            }
            else if(expressionSize == 3)
            {

                String[] expression = textArea.getText().split(" ");
                long result = 0l;
                switch (expression[1]){
                    case "+":
                        result = Long.parseLong(expression[0]) + Long.parseLong(expression[2]);
                        break;
                    case "-":
                        result = Long.parseLong(expression[0]) - Long.parseLong(expression[2]);
                        break;
                    case "*":
                        result = Long.parseLong(expression[0]) * Long.parseLong(expression[2]);
                        break;
                    case "/":
                        result = Long.parseLong(expression[0]) / Long.parseLong(expression[2]);
                        break;
                }

                textArea.append("=\n" + result);
            }
            else if (expressionSize > 3)
            {
                textArea.setText("");
            }


            System.out.println("button.getName() = " + textArea.getText());
        }
    }
}
