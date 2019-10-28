package com.app.book;

public class Reading extends Book {
    String time = "无";

    @Override
    public String toString() {
        return "Reading{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", pages=" + pages +
                ", price=" + price + ", time=" + time +
                '}';
    }

    public Reading(String bookId, String bookName, int pages, int price) {
        super(bookId, bookName, pages, price);
    }
    public void fiction(){
        super.bookId = "LFQ";
        super.bookName = "老番茄";
        super.pages = 1000;
        super.price = 50;

    }
    public void magzine(){
        super.bookId = "MH";
        super.bookName = "某幻";
        super.pages = 409;
        super.price = 99;
         time = "2019/10/28";
    }
}
