package userService;

import loginform.QQForm;

import java.io.*;
import java.net.*;
import java.util.Iterator;

public class ServerSocketTcp extends Thread{
    String mes,nei;
    public String ServerSocketTcp(String mes){
        nei = this.mes;
        this.mes = mes;
        return nei;
    }
    @Override
    public void run() {
            int serverPort = 8180;
            try {
                ServerSocket serverSocket = new ServerSocket(serverPort);
                String content = null;
                while (true){
                    String serverAddress = "127.0.0.1";
                    Socket socket = serverSocket.accept();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                    content = bufferedReader.readLine();
                    ServerSocketTcp(content);
                    //InetAddress inetAddress = socket.getInetAddress();//获取客户端的连接
                    //  ServerThread thread = new ServerThread(socket, inetAddress);//自己创建的线程类
                    //   thread.start();//启动线程
                }
                //打印客户端数量
                //通过while循环不断读取信息，
           /* try {
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
            }*/
            }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
