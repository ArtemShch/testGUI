package main;

import GUI.*;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        MyPanel panel = new MyPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        MyJTextArea textArea = new MyJTextArea();
        MyJTextField textField = new MyJTextField(textArea);

        //добавляем четыре кнопки

        MyButton buttonPlus = new MyButton("+", textArea);
        MyButton buttonMinus = new MyButton("-", textArea);
        MyButton buttonMultiplu = new MyButton("*", textArea);
        MyButton buttonDiv = new MyButton("/", textArea);

        MyPanel buttonPanel = new MyPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        buttonPanel.add(buttonDiv, buttonMinus, buttonMultiplu, buttonPlus);
        panel.add(textArea, textField, buttonPanel);

        MyFrame frame = new MyFrame("Calculator", panel);
        frame.setVisible(true);
    }
}
