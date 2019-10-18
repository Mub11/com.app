

import Result.Result;
import app.Userinfo;
import app.UserinterImpl;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        UserinterImpl userinterImpl = new UserinterImpl();
        Userinfo userinfo = new Userinfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("choose: 1.Login 2.register 3.regiseter.. 4.exit  ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1: {
                Userinfo userLogin = new Userinfo();
                System.out.println("Please input your Username");
                userLogin.setUsername(scan.next());
                System.out.println("Please input your password");
                userLogin.setUserpassword(scan.next());
                Result resultlogin = userinterImpl.login(userLogin);
                System.out.println(resultlogin.getResultmessage());
                break;
            }
            case 2: {
                Userinfo userRegitster = new Userinfo();
                System.out.println("Please input your Username");
                userRegitster.setUsername(scan.next());
                System.out.println("Please input your password");
                userRegitster.setUserpassword(scan.next());
                Result resultRegister = userinterImpl.register(userRegitster);
                System.out.println(resultRegister.getResultmessage());
                break;
            }
            case 3:{
                userinterImpl.registerme();
                break;
            }
            default:{
                break;
            }
        }
    }
}
