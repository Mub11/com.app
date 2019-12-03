package userService;

import java.io.OutputStream;
import java.net.Socket;

public class ClientThread implements Runnable {
    String message;
    String ip;
    public ClientThread(String  message,String ip) {
        this.message=message;
        this.ip=ip;
    }

    @Override
    public void run() {

        try {

            Socket socket = new Socket(ip,8180);
            OutputStream os = socket.getOutputStream();

            byte cache[]= message.getBytes();
            os.write(cache);
            os.flush();
            os.close();
            System.out.println(cache.length);
            //socket.close();
        } catch (Exception e) {
                // TODO: handle exception
                }
                }

                }