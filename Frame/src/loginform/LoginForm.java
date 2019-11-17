package loginform;

import registerform.RegisterForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passText;
    private JButton loginButton;
    private JButton registerButton;
    private JButton helpButton;
    public LoginForm(){
        setTitle("Login Form");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panelLogin.add(userLabel);
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10,50,80,25);
        panelLogin.add(passLabel);
        userText = new JTextField(10);
        userText.setBounds(100,20,170,25);
        panelLogin.add(userText);
        passText = new JPasswordField(10);
        passText.setBounds(100,50,170,25);
        panelLogin.add(passText);
        loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panelLogin.add(loginButton);
        registerButton = new JButton("register");
        registerButton.setBounds(100,80,80,25);
        panelLogin.add(registerButton);
        helpButton = new JButton("help");
        helpButton.setBounds(190,80,80,25);
        panelLogin.add(helpButton);
        add(panelLogin);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterForm registerForm = new RegisterForm();
                registerForm.setFrameRegisterVisibe(true);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QQForm qqForm = new QQForm();
                qqForm.setFrameWeChatVisible(true);
            }
        });
    }
    public void setFrameLoginVisibe(Boolean Visibe){
        setVisible(Visibe);
    }
}