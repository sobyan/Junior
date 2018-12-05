package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    private JButton button = new JButton("Нажмите");
    protected JTextField input1 = new JTextField("Привет", 5);
    private JTextField input2 = new JTextField("Мир!", 5);

    public GUI () {
        super ("Простая программа");
        this.setBounds(150, 200, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(input1);
        container.add(input2);

        //button.addActionListener(new ButtonEventListener());
        container.add(button);
    }


}


