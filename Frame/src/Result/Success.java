package Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Success extends JFrame {
    private JPanel panelSuccess;
    private JLabel successLabel;
    private JButton successButton;
    public Success(){
        setSize(350,200);

        panelSuccess = new JPanel();
        panelSuccess.setLayout(null);
        successLabel = new JLabel("Successfully!");
        successLabel.setBounds(110,50,80,25);
        panelSuccess.add(successLabel);
        successButton = new JButton("Complete");
        successButton.setBounds(100,100,100,25);
        panelSuccess.add(successButton);
        add(panelSuccess);
        setFrameSuccVisibe(true);
        successButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setFrameSuccVisibe(false);
            }
        });
    }
    public void setFrameSuccVisibe(Boolean Visibe){
        setVisible(Visibe);
    }
}
