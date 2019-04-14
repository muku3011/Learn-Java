package com.topics.creational;


import java.util.ArrayList;
import java.util.List;

public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("Aryan");
        bookShop1.loadBooks();


        BookShop bookShop2 = (BookShop) bookShop1.clone();
        bookShop2.setShopName("JNL");

        bookShop1.getBooks().remove(2);

        System.out.println(bookShop1);
        System.out.println(bookShop2);

    }

}

class Book {

    private int bid;
    private String bname;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}

class BookShop implements Cloneable {

    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 1; i <= 10; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book " + i);
            getBooks().add(book);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();

        for (Book book : this.getBooks()) {
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
