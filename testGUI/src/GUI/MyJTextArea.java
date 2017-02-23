package GUI;

import javax.swing.*;

public class MyJTextArea extends JTextArea {
    public MyJTextArea() {
        super();
        this.setEditable(false);
        this.setFocusable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
    }
}
