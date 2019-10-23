package com.app.book;

public class Bookmanger {
    public static void main(String[] args){
        Book dictionaryBook = new Dictionary("u", "b", 5);
        Book book = new Book("m","u",90);
        Dictionary xinhua = new Dictionary("m", "b", 5);
        System.out.println("页数：" + xinhua.getPages() + "词条数：" + xinhua.getDenfinitions() + "每页词条数：" + xinhua.computeRation());
        System.out.println(xinhua.toString());
        System.out.println(dictionaryBook.getBookId());
        System.out.println(book.getBookId());
    }
}
