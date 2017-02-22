package testGUI;

import GUI.MyButton;
import GUI.MyFrame;
import GUI.MyJTextArea;
import GUI.MyPanel;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class testGUI {

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
//
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        //создаем кнопку
//      //  MyButton button = new MyButton("Button");
//        MyJTextArea textArea = new MyJTextArea();
//        //вкладываем кнопку в панель
  //      MyPanel panel = new MyPanel("Panel", 200, 200);
//        //панель с кнопкой вкладываем во фрэйм
//
//        MyFrame frame = new MyFrame(400, 400,"Frame", panel);
//
//
//        frame.add(textArea);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JFrame f = new JFrame("Frame");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);

        JTextField tf = new JTextField("JTextField");
        tf.setMaximumSize(new Dimension(Integer.MAX_VALUE, 10));
        JTextArea textArea = new JTextArea("JTextArea");

        panel.add(textArea);
        panel.add(tf);

        //добавляем четыре кнопки

        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiplu = new Button("*");
        Button buttonDiv = new Button("/");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiplu);
        buttonPanel.add(buttonDiv);

        f.getContentPane().add(panel);
        panel.add(buttonPanel);

    }
}
