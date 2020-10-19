package prack4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Panel extends JFrame {
    private final String REAL = "Real Madrid", MILAN = "AC Milan";

    private int real, milan;
    private JLabel result;
    private JLabel last;
    private JLabel winner;


    public Panel(String title) throws HeadlessException {
        super(title);
        setSize(500, 400);
        setLayout(null);

        last = new JLabel();
        result = new JLabel();
        winner = new JLabel();

        JButton jButtonM = new JButton(MILAN);
        JButton jButtonR = new JButton(REAL);

        result.setBounds(10, 10, 400, 40);
        last.setBounds(10, 60, 400, 40);
        winner.setBounds(10, 110, 400, 40);

        jButtonR.setBounds(5, 300, 150,40);
        jButtonM.setBounds(300, 300,  150,40);

        jButtonM.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                setResult();
                setLast(MILAN);
                setWinner();
            }
        });

        jButtonR.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                setResult();
                setLast(REAL);
                setWinner();
            }
        });

        add(result);
        add(last);
        add(winner);
        add(jButtonM);
        add(jButtonR);

        setResult();
        setLast("");
        setWinner();

        setVisible(true);
    }

    private void setResult(){
        result.setText("Resultat: " + real + " - " + milan);
    }

    private void setLast(String name){
        last.setText("Last Scorer: " + name);
    }

    private void setWinner(){
        winner.setText("Winner = " + (milan > real ? MILAN : REAL));
    }
}
