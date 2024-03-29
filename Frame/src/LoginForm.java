
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
        JFrame frame1 = new JFrame("register");
        frame1.setSize(500,200);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        frame1.setVisible(true);
    }
    private static  void placeComponents(JPanel panel){
        final  String COMMAND_LOGIN = "LOGIN";
        panel.setLayout(null);
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);
        JTextField userText = new JTextField(10);
        userText.setBounds(100,20,170,25);
        panel.add(userText);
        JPasswordField passText = new JPasswordField(10);
        passText.setBounds(100,50,170,25);
        panel.add(passText);
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
        JButton registerButton = new JButton("register");
        registerButton.setBounds(100,80,80,25);
        panel.add(registerButton);
        JButton helpButton = new JButton("help");
        helpButton.setBounds(190,80,80,25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panel.add(helpButton);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if (COMMAND_LOGIN.equals(command)){
                    System.out.println("ok//");
                    JOptionPane.showMessageDialog(null,"老番茄");
                }else {
                    System.out.println("cancel//");
                }
            }
        };
        loginButton.addActionListener(actionListener);
    }
}
