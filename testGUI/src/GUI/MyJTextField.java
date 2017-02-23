package GUI;

import listeners.TextFieldListener;

import javax.swing.*;
import java.awt.*;


public class MyJTextField extends JTextField {
    public MyJTextField(MyJTextArea textArea) {
        super();
        super.addActionListener(new TextFieldListener(textArea));
        super.setMaximumSize(new Dimension(Integer.MAX_VALUE, 10));
//        super.requestFocusInWindow();
    }
}
