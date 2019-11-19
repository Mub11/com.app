package loginform;

import registerform.RegisterForm;

import javax.swing.*;

public class QQForm extends JFrame {
    public QQForm(){
        setTitle("QQ Form");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        LoginForm loginForm = new LoginForm();
        loginForm.setFrameLoginVisibe(true);
    }
    public void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}
