package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Focus extends JFrame implements MouseListener {
    public Focus() throws HeadlessException {
        super("Focus");
        setName("MyFrame");
        setSize(400, 340);
        this.setLayout(null);

        Label CENTER = new Label();
        CENTER.setName("CENTER");
        CENTER.setBackground(Color.BLUE);
        CENTER.setSize(200, 100);
        CENTER.setLocation(80, 100);
        CENTER.addMouseListener(this);

        Label NORTH = new Label();
        NORTH.setName("NORTH");
        NORTH.setBackground(Color.BLACK);
        NORTH.setSize(200, 100);
        NORTH.setLocation(80, 0);
        NORTH.addMouseListener(this);

        Label SOUTH = new Label();
        SOUTH.setName("SOUTH");
        SOUTH.setBackground(Color.MAGENTA);
        SOUTH.setSize(200, 100);
        SOUTH.setLocation(80, 200);
        SOUTH.addMouseListener(this);

        Label EAST = new Label();
        EAST.setName("EAST");
        EAST.setBackground(Color.RED);
        EAST.setSize(140, 100);
        EAST.setLocation(280, 100);
        EAST.addMouseListener(this);

        Label WEST = new Label();
        WEST.setName("WEST");
        WEST.setBackground(Color.CYAN);
        WEST.setSize(140, 100);
        WEST.setLocation(0, 100);
        WEST.addMouseListener(this);



        add(CENTER);
        add(EAST);
        add(WEST);
        add(NORTH);
        add(SOUTH);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String res = null;

        switch (e.getComponent().getName()){
            case "CENTER":{
                res = "Добро пожаловать в CENTER";
                break;
            }
            case "WEST":{
                res = "Добро пожаловать в Джидда";
                break;
            }
            case "SOUTH":{
                res = "Добро пожаловать в Абха";
                break;
            }
            case "NORTH":{
                res = "Добро пожаловать в NORTH";
                break;
            }

            case "EAST":{
                res = "Добро пожаловать в Дахране";
                break;
            }
        }

        if (res != null) {
            JOptionPane.showMessageDialog(this, res);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
