package lab5;


import lab5.Task1.shap.Circle;
import lab5.Task1.shap.Rectangle;
import lab5.Task1.shap.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Panel extends JFrame {
    public Panel() throws HeadlessException {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setTitle("Shapes");

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graph = (Graphics2D) g;
        int x, y = 50;
        for (int i = 0; i < 5; i++){
            x = 10;
            for (int j = 0; j < 4; j++) {
                getRandShape().draw(graph, x , y);
                x+=80;
            }
            y+=100;
        }
    }

    public Shape getRandShape(){
        Random r = new Random();
        Color color = new Color(
                r.nextInt(255),
                r.nextInt(255),
                r.nextInt(255)
        );
        switch (r.nextInt(3)){
            case 1:
                return new Rectangle(r.nextInt(60) + 10, r.nextInt(60) + 10, color, true);
            case 2:
                int x = r.nextInt(60) + 10;
                return new Rectangle(x, x, Color.RED, true);
            default:
                return new Circle(r.nextInt(60) + 10, color, false);
        }
    }
}
