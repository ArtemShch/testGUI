package testGUI;

import GUI.MyButton;
import GUI.MyFrame;
import GUI.MyPanel;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class testGUI {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);
        //создаем кнопку
        MyButton button = new MyButton("Button");
        //вкладываем кнопку в панель
        MyPanel panel = new MyPanel("Panel", 200, 200, new FlowLayout(), button);
        //панель с кнопкой вкладываем во фрэйм
        MyFrame frame = new MyFrame(400, 400,"Frame", panel);
    }
}
