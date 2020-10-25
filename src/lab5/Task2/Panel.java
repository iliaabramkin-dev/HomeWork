package lab5.Task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JFrame {

    public Panel(String path) throws HeadlessException {
        super("Image");
        JPanel jPanel = new JPanel();
        setSize(1000, 500);
        add(jPanel);
        setVisible(true);

        try {
            BufferedImage image = ImageIO.read(new File(path));
            jPanel.getGraphics().drawImage(image, 0, 0, jPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
