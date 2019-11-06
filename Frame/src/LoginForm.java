import javax.swing.*;

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
        registerComponents(panel1);
        frame1.setVisible(true);
    }
    private static  void placeComponents(JPanel panel){
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
        panel.add(helpButton);
    }
    private static void registerComponents(JPanel panel){
        panel.setLayout(null);
        JLabel userLabel = new JLabel("you username:");
        userLabel.setBounds(10,20,120,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(150,20,170,25);
        panel.add(userText);
        JLabel passLabel = new JLabel("you password:");
        passLabel.setBounds(10,50,120,25);
        panel.add(passLabel);
        JTextField passText = new JTextField(20);
        passText.setBounds(150,50,170,25);
        panel.add(passText);
        JLabel numLabel = new JLabel("you phone number:");
        numLabel.setBounds(10,80,120,25);
        panel.add(numLabel);
        JTextField numText = new JTextField(20);
        numText.setBounds(150,80,170,25);
        panel.add(numText);
        JButton complete = new JButton("complete");
        complete.setBounds(150,110,120,25);
        panel.add(complete);
    }
}
