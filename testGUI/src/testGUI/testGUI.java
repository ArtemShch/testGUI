package testGUI;

import GUI.MyButton;
import GUI.MyFrame;
import GUI.MyJTextArea;
import GUI.MyPanel;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import listeners.ButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testGUI {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JFrame f = new JFrame("Frame");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(400, 400));

       f.setResizable(false);


        JTextField tf = new JTextField();
        tf.setMaximumSize(new Dimension(Integer.MAX_VALUE, 10));
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFocusable(false);

        panel.add(textArea);
        
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField textField = (JTextField) e.getSource();
                System.out.println(" textField.getText() = " +  textField.getText());
                textArea.append(textField.getText() + "\n");
            }
        });
        panel.add(tf);
        

        //добавляем четыре кнопки

        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ButtonListener(textArea));
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ButtonListener(textArea));
        JButton buttonMultiplu = new JButton("*");
        buttonMultiplu.addActionListener(new ButtonListener(textArea));
        JButton buttonDiv = new JButton("/");
        buttonDiv.addActionListener(new ButtonListener(textArea));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiplu);
        buttonPanel.add(buttonDiv);



        f.getContentPane().add(panel);
        panel.add(buttonPanel);

        f.setVisible(true);

    }
}
