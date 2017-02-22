package listeners;

import GUI.MyJTextArea;

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
        JTextField textField = (JTextField) e.getSource();
        int expressionSize = textArea.getText().split(" ").length;
        System.out.println("textArea.getText().isEmpty() = " + textArea.getText().isEmpty());
        System.out.println("textArea.getText() = " + textArea.getText());
        System.out.println("expressionSize = " + expressionSize);
        if ((textArea.getText().isEmpty() && expressionSize == 1 || !textArea.getText().isEmpty() && expressionSize == 0) || expressionSize == 2)
        {
            textArea.append(textField.getText() + " ");
        }

    }
}
