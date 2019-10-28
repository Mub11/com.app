package com.app.book;

import java.util.Scanner;
public class BooksImpl implements Books {
    Reading reading = new Reading("M","B",0,0);
    @Override
    public void product() {
        System.out.println("input your number");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1: {
                reading.fiction();
                break;
            }
            case 2: {
                reading.magzine();
                break;
            }
            default:{
                System.out.println("input error");
                break;
            }
        }

    }

    @Override
    public void output() {
        System.out.println(reading.toString());

    }
}
