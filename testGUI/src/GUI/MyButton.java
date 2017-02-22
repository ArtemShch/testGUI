package GUI;

import listeners.ButtonListener;

import javax.swing.*;

public class MyButton extends JButton {
    public MyButton(String text, JTextArea textArea) {
        super(text);
        this.addActionListener(new ButtonListener(textArea));
    }
}
