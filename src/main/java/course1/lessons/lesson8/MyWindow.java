package course1.lessons.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing.");
            }
        });
//        JButton button1 = new JButton("Button 1");
//        JButton button2 = new JButton("Button 2");
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);

        setLayout(null);
//        for (int i = 1; i < 10; i++) {
//            JButton button = new JButton("#" + i);
//            add(button);
//        }

        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 120, 32);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);

        JButton button = new JButton("Press here!");
        button.setBounds(20, 60, 120, 32);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("ButtonPressed");
            }
        });
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
