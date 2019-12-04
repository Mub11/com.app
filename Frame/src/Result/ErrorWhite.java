package Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWhite extends JFrame {
    private JPanel panelWhite;
    private JLabel whiteLabel;
    private JButton whiteButton;
    public ErrorWhite(){
        setSize(350,200);

        panelWhite = new JPanel();
        panelWhite.setLayout(null);

        whiteLabel = new JLabel("Don't white");
        whiteLabel.setBounds(110,50,80,25);
        panelWhite.add(whiteLabel);

        whiteButton = new JButton("Know");
        whiteButton.setBounds(100,100,100,25);
        panelWhite.add(whiteButton);
        add(panelWhite);
        setVisible(true);

        whiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
