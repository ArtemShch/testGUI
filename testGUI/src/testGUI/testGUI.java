package testGUI;

import GUI.MyButton;
import GUI.MyFrame;
import GUI.MyPanel;

import java.awt.*;

public class testGUI {

    public static void main(String[] args) {
        //создаем кнопку
        MyButton button = new MyButton("Button");
        //вкладываем кнопку в панель
        MyPanel panel = new MyPanel("Panel", 200, 200, new FlowLayout(), button);
        //панель с кнопкой вкладываем во фрэйм
        MyFrame frame = new MyFrame(400, 400,"Frame", panel);
    }
}
