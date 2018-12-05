package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener {
        GUI gui = new GUI();
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Button was pressed\n";
        message += "Text is " + gui.input1.getText() + "\n";
        //message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
        //message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
        JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
    }
}
