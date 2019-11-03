package com.app.book.abst;

import com.app.book.Book;
import com.app.book.DefaultValue;

public class Dictionary extends Book {
    private int denfinitions = 500;

    public Dictionary(String bookId, String bookName, int pages, int price) {
        super(bookId, bookName, pages, price);
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "denfinitions=" + denfinitions +
                ", bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", pages=" + pages +
                '}';
    }

    public double computeRation(){
        return denfinitions / pages;
    }
    public int getDenfinitions() {
        return denfinitions;
    }

    public void setDenfinitions(int denfinitions) {
        this.denfinitions = denfinitions;
    }
    @Override
    public String getBookId() {
        return DefaultValue.Defalute_UBN + super.getBookId();
    }
}