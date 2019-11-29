package Result;

import javax.swing.*;

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
    }
}
