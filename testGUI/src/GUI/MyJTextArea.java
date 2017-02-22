package GUI;

import javax.swing.*;

public class MyJTextArea extends JTextArea {
    public MyJTextArea() {
        super();
        this.setEditable(false);
        this.setFocusable(false);
    }
}
