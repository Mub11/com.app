package com.app.book;

import java.util.Scanner;
public class BooksImpl implements Books {
    Reading reading = new Reading("M","B",0,0);
    @Override
    public void product(int choose) {
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
