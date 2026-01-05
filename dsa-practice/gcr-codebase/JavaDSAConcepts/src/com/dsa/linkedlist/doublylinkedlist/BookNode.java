package com.dsa.linkedlist.doublylinkedlist;

class BookNode {
    String title, author, genre;
    int bookId;
    boolean available;

    BookNode next, prev;

    public BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}