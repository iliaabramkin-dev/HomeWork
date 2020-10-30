package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Area;

public class AreaText extends JFrame {
    public AreaText() throws HeadlessException {
        super("Areatext");
        setLayout(null);
        setSize(400, 400);

        JTextArea text = new JTextArea();
        text.setSize(200, 400);
        text.setLocation(0,0);

        Button button = new Button("RED");
        button.setSize(50, 20);
        button.setLocation(220, 20);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });

        Button button2 = new Button("BLUE");
        button2.setSize(50, 20);
        button2.setLocation(220, 40);
        button2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });

        Button button3 = new Button("YELLOW");
        button3.setSize(50, 20);
        button3.setLocation(220, 60);
        button3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.YELLOW);
            }
        });

        Button f1 = new Button("Times New Roman");
        f1.setSize(100, 20);
        f1.setLocation(220, 100);
        f1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont( new Font("Times New Roman", Font.PLAIN, 20));
            }
        });

        Button f2 = new Button("MS Sans Serif");
        f2.setSize(100, 20);
        f2.setLocation(220, 130);
        f2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont( new Font("MS Sans Serif", Font.PLAIN, 20));
            }
        });

        Button f3 = new Button("Courier");
        f3.setSize(100, 20);
        f3.setLocation(220, 160);
        f3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont( new Font("Courier New", Font.PLAIN, 20));
            }
        });

        add(text);
        add(button);
        add(button3);
        add(button2);
        add(f1);
        add(f2);
        add(f3);
        setVisible(true);
    }
}
