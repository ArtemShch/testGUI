package GUI;

import javax.swing.*;

public class MyButton extends JButton {
    public MyButton(String text) {
        super(text);
    }

    public MyButton(String text, int wight, int height) {
        this(text);
        this.setSize(wight, height);
    }
}
