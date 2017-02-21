package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(int wight, int height, String title)
    {
        super(title);
        super.setSize(wight, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setVisible(true);
    }

    public MyFrame(int wight, int height, String title, Component component)
    {
        this(wight, height, title);
        this.getContentPane().add(component);
    }

}