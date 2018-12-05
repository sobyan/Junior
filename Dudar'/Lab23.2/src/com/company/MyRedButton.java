package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRedButton extends JFrame {

    private JLabel label = new JLabel("Введите число: ");
    private JTextField input = new JTextField("");
    private JButton button = new JButton("Скрыть поле");

    public MyRedButton () {
        super("Простая программа");
        this.setBounds(150, 200, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2));
        container.add(label);
        container.add(input);
        input.setBackground(Color.red);
        button.addActionListener(new OnClickEvent());
        container.add(button);
    }

        class OnClickEvent implements ActionListener {
            public void actionPerformed (ActionEvent e) {
                input.setVisible(!input.isVisible());
                String txt = input.isVisible() ? "Скрыть поле" : "Показать поле";
                button.setText(txt);
            }
        }

}
