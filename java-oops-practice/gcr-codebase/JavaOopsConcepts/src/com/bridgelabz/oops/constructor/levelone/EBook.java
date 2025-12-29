package com.bridgelabz.oops.constructor.levelone;

public class EBook extends Book2 {

    String fileFormat;

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showEBookDetails() {

        // accessing public member (allowed)
        System.out.println("ISBN   : " + ISBN);

        // accessing protected member (allowed in subclass)
        System.out.println("Title  : " + title);

        // accessing private member through getter (NOT directly)
        System.out.println("Author : " + getAuthor());

    }

    public static void main(String[] args) {

        EBook e = new EBook("BK102", "Java Handbook", "Robert Martin");
        e.showEBookDetails();
    }
}