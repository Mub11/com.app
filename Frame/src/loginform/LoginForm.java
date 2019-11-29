package loginform;

import Result.Error;
import registerform.RegisterForm;
import userinfo.Userinfo;
import utils.LoginCheck;

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
    Userinfo userinfo = new Userinfo("1","1");
    LoginCheck loginCheck = new LoginCheck();
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
        class registerListener implements ActionListener{

            public void actionPerformed(ActionEvent e){
                RegisterForm registerForm = new RegisterForm();
                registerForm.setFrameRegisterVisibe(true);
                dispose();
            }
        }
        registerButton.addActionListener(new registerListener());
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userinfo.setUsername(userText.getText());
                userinfo.setUserpassword(String.valueOf(passText.getPassword()));
                int result = loginCheck.loginCheck(userinfo);
                Error error = new Error(result);
                dispose();
            }
        });
    }
    public void setFrameLoginVisibe(Boolean Visibe){
        setVisible(Visibe);
    }
}