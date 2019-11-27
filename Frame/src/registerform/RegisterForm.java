package registerform;

import Result.Success;
import userService.UserDAOImpl;
import userinfo.Userinfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterForm extends JFrame{
    Userinfo userinfo = new Userinfo("1","1");
    private JPanel panelregister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JLabel numLabel;
    private JTextField numText;
    private JTextField passText;
    private JButton loginButton;
    private JButton registerButton;
    private JButton complete;
    public RegisterForm(){
        setTitle("Register Form");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelregister = new JPanel();
        panelregister.setLayout(null);
        userLabel = new JLabel("you username:");
        userLabel.setBounds(10,20,120,25);
        panelregister.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(150,20,170,25);
        panelregister.add(userText);
        passLabel = new JLabel("you password:");
        passLabel.setBounds(10,50,120,25);
        panelregister.add(passLabel);

        passText = new JPasswordField(20);
        passText.setBounds(150,50,170,25);
        panelregister.add(passText);

        numLabel = new JLabel("you phone number:");
        numLabel.setBounds(10,80,120,25);
        panelregister.add(numLabel);
        numText = new JTextField(20);
        numText.setBounds(150,80,170,25);
        panelregister.add(numText);
        complete = new JButton("complete");
        complete.setBounds(150,110,120,25);
        panelregister.add(complete);
        add(panelregister);
        complete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userinfo = User();
                UserDAOImpl userDAO = new UserDAOImpl();
                userDAO.saveUser(userinfo);
                dispose();
                Success success = new Success();
            }
        });
    }
    public Userinfo User(){
        userinfo.setUsername(userText.getText());
        userinfo.setUserpassword(String.valueOf(passText.getText()));
        return  userinfo;
    }
    public void setFrameRegisterVisibe(Boolean Visibe){
        setVisible(Visibe);
    }
}
