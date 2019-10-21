package com.app.book;

public class Dictionary extends Book {
    private int denfinitions = 500;

    public Dictionary(String bookId, String bookName, int pages) {
        super(bookId, bookName, pages);
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
}
