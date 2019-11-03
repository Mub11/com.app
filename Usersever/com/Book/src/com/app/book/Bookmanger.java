package com.app.book;

import java.util.Scanner;

public class Bookmanger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        Book dictionaryBook = new Dictionary("u", "b", 5,4);
        Book book = new Book("m","u",90,0 );
        Dictionary xinhua = new Dictionary("m", "b", 5,4);
        BooksImpl booksImpl = new BooksImpl();
        booksImpl.product(choose);
        booksImpl.output();
//        System.out.println("页数：" + xinhua.getPages() + "词条数：" + xinhua.getDenfinitions() + "每页词条数：" + xinhua.computeRation());
/*        System.out.println(book.toString());
        System.out.println(dictionaryBook.getBookId());
        System.out.println(book.getBookId());*/
    }
}
