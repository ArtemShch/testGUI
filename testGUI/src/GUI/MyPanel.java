package GUI;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel() {
    }

    public MyPanel(LayoutManager layout) {
        this.setLayout(layout);
    }


    public void add(Component... components)
    {
        if (components != null && components.length > 0)
        {
            for (Component component : components)
            {
                this.add(component);
            }
        }
    }
}
