package loginform;

import userService.ServerSocketTcp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class QQForm extends JFrame {
    ServerSocketTcp serverSocketTcp = new ServerSocketTcp();
    private JPanel panelQQ;
    private JLabel inputLabel;
    public JTextField inputText;
    private JLabel outputLabel;
    public JTextArea outputText;
    private JLabel ipLabel;
    private JTextField ipText;
    private JButton severButton;
    private JButton sendButton;
    public QQForm(){
        setTitle("QQ Form");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelQQ = new JPanel();
        panelQQ.setLayout(null);
        inputText = new JTextField(100);
        inputText.setBounds(10,150,300,50);
        panelQQ.add(inputText);
        outputText = new JTextArea(5,20);
        outputText.setBounds(10,10,300,125);
        panelQQ.add(outputText, BorderLayout.CENTER);
        severButton = new JButton("显示");
        severButton.setBounds(320,170,80,30);
        panelQQ.add(severButton);
        sendButton = new JButton("发送");
        sendButton.setBounds(410,170,80,30);
        panelQQ.add(sendButton);
        ipLabel = new JLabel("对方IP");
        ipLabel.setBounds(320,100,50,30);
        panelQQ.add(ipLabel);
        ipText = new JTextField(20);
        ipText.setBounds(320,125,100,20);
        panelQQ.add(ipText);

        add(panelQQ);
        serverSocketTcp.start();
        class qqListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.setText(serverSocketTcp.ServerSocketTcp(null));
             //   new Thread(new ClientThread(content,"127.0.0.1")).start();
            }
        }
        class sendB implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {
                String message = inputText.getText();
                try {
                    String serverAddress = ipText.getText();
                    int serverPort = 8180;
                    Socket socket = new Socket(serverAddress, serverPort);
                    BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    bufferedWriter.write(message);
                    bufferedWriter.flush();
                    socket.shutdownOutput();
                }catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (ConnectException e) {
                    System.out.println("can not get connection, please try again!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        sendButton.addActionListener(new sendB());
        severButton.addActionListener(new qqListener());
    }
    public static void main(String[] args){
        LoginForm loginForm = new LoginForm();
        loginForm.setFrameLoginVisibe(true);
    }
    public void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}
