package com.company;

import java.io.*;
import java.util.Scanner;

import com.company.Userinfo;
import com.company.UserinterImpl;

public class Main {
    public static void main(String[] args) throws IOException {
        UserinterImpl userinterImpl = new UserinterImpl();
        Userinfo userinfo = new Userinfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("choose: 1.Login 2.register");
        int choose = scan.nextInt();
        switch (choose) {
            case 1: {
                System.out.println("Please input your Username");
                userinfo.setUsername(scan.next());
                System.out.println("Please input your password");
                userinfo.setUserpassword(scan.next());
                userinterImpl.Login(userinfo);
                break;
            }
            case 2: {
                Userwri userwri = new Userwri();
                userwri.write();
                break;
            }
        }
    }
}
