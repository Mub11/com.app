package com.app.book;

public class Book {
    public String bookId;
    public String bookName;
    protected int pages;
    public int price;

    public Book(String bookId, String bookName, int pages, int price){
        this.bookId =  bookId;
        this.bookName = bookName;
        this.pages = pages;
        this.price = price;
    }
    @Override
    public String toString() {
        return bookId + bookName + pages;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPags(int pages) {
        this.pages = pages;
    }
}
