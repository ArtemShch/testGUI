package GUI;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(String name, int weight, int height) {
        super.setName(name);
        super.setSize(weight, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyPanel(String name, int weight, int height, Component component) {
        this(name, weight, height);
        this.add(component);
    }

    public MyPanel(String name, int weight, int height, LayoutManager layout) {
        this(name, weight, height);
        this.setLayout(layout);
    }

    public MyPanel(String name, int weight, int height, LayoutManager layout, Component component) {
        this(name, weight, height);
        this.setLayout(layout);
        this.add(component);
    }
}
