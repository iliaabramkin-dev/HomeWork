package lab5.Task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JFrame {
    public Panel() throws HeadlessException {
        super("Image");
        JPanel jPanel = new JPanel();
        setSize(300, 300);
        add(jPanel);
        setVisible(true);
        try {
            BufferedImage image1 = ImageIO.read(new File("C:\\Users\\user\\Downloads\\sobaka.png"));
            BufferedImage image2 = ImageIO.read(new File("C:\\Users\\user\\Downloads\\sobaka2.png"));
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    jPanel.getGraphics().drawImage(image1, 0, 0, jPanel);
                } else {
                    jPanel.getGraphics().drawImage(image2, 0, 0, jPanel);
                }
                Thread.sleep(100);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
