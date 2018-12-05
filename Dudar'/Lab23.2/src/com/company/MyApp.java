package com.company;

import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame{

    private JLabel label = new JLabel("Введите имя: ");
    private JTextField input = new JTextField("", 5);
    private JButton button = new JButton("Всё готово");
    private JCheckBox checkBox = new JCheckBox("Согласны?", true);


    public MyApp () {
        super ("Простая программа");
        this.setBounds(150, 200, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2));
        container.add(label);
        container.add(input);
        container.add(button);
        container.add(checkBox);
    }
}
