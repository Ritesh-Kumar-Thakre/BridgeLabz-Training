package com.dsa.linkedlist.circularlinkedlist;

class Ticket {
    int ticketId;
    String customer, movie, seat;
    Ticket next;

    Ticket(int id, String c, String m, String s) {
        ticketId = id;
        customer = c;
        movie = m;
        seat = s;
    }
}