package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Game extends JFrame {
    private int h = 3, num;
    private boolean play;
    public Game() {
        super("Угадайка");
        Random random = new Random();
        setSize(400, 200);
        JPanel contents = new JPanel();
        contents.setLayout(null);
        Label label = new Label();
        label.setText("Я загадал, Попробуй угадать.\nОсталось " + h + " попытки.");
        label.setSize(400, 20);
        label.setLocation(10, 1);


        Button button = new Button();
        button.setSize(100, 20);
        button.setLabel("Угадать");
        button.setLocation(50, 50);
        contents.add(label);
        contents.add(button);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (play || h == 0) {
                    play = false;
                    h = 3;
                    num = random.nextInt(20);
                    label.setText("Я загодал, Попробуй угадать.\nОсталось " + h + " попытки.");
                    button.setLabel("Угадать");
                    return;
                }
                String res = JOptionPane.showInputDialog("Введи число");
                int input = Integer.parseInt(res);
                if (input < num) {
                    label.setText("Загаданное число больше " + input + ".\nОсталось " + --h + " попытки.");
                }
                if (input > num) {
                    label.setText("Загаданное число меньше " + input + ".\nОсталось " + --h + " попытки.");
                }

                if (input == num) {
                    label.setText("Ты угадал это число " + input);
                    button.setLabel("Начать сначала");
                    play = true;
                }
                if (h == 0) {
                    label.setText("Ты проиграл это число " + num);
                    button.setLabel("Начать сначала");
                }
            }
        });

        num = random.nextInt(20);
        add(contents);
        setVisible(true);
    }
}
