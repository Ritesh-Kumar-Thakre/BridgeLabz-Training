package com.dsa.linkedlist.singlylinkedlist;

class User {
    int userId; String name;
    Friend friends;
    User next;

    User(int id, String n) {
        userId = id;
        name = n;
        friends = null;
    }
}