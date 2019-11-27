package Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error extends JFrame{
    private JPanel panelSuccess;
    private JLabel successLabel;
    private JButton successButton;
    public Error(int result){
        setSize(350,200);

        if(result == 0){
            successLabel = new JLabel("Error");
            successLabel.setBounds(135,50,80,25);
        }
        else if(result == 1){
            successLabel = new JLabel("Password error");
            successLabel.setBounds(110,50,150,25);
        }
        else if(result == 2){
            successLabel = new JLabel("Username error");
            successLabel.setBounds(110,50,150,25);
        }
        else if(result == 3){
            successLabel = new JLabel("Successfully!");
            successLabel.setBounds(110,50,80,25);
        }
        panelSuccess = new JPanel();
        panelSuccess.setLayout(null);
        panelSuccess.add(successLabel);
        successButton = new JButton("Complete");
        successButton.setBounds(100,100,100,25);
        panelSuccess.add(successButton);
        add(panelSuccess);
        setFrameSuccVisibe(true);
        successButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public void setFrameSuccVisibe(Boolean Visibe){
        setVisible(Visibe);
    }
}
