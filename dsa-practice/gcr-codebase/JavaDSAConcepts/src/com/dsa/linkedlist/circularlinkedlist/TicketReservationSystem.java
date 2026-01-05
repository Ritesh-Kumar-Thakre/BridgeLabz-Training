package com.dsa.linkedlist.circularlinkedlist;

public class TicketReservationSystem {

    static Ticket head = null;

    static void addTicket(int id, String c, String m, String s) {
        Ticket n = new Ticket(id, c, m, s);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        Ticket t = head;
        while (t.next != head) t = t.next;

        t.next = n;
        n.next = head;
    }

    static void displayTickets() {
        if (head == null) return;

        Ticket t = head;

        do {
            System.out.println(t.ticketId + " | " + t.customer + " | " + t.movie + " | " + t.seat);
            t = t.next;
        } while (t != head);
    }

    static void deleteTicket(int id) {

        if (head == null) return;

        Ticket t = head, prev = null;

        if (head.ticketId == id) {

            while (t.next != head) t = t.next;

            t.next = head.next;
            head = head.next;
            return;
        }

        do {
            prev = t;
            t = t.next;
        } while (t != head && t.ticketId != id);

        if (t.ticketId == id) prev.next = t.next;
    }

    public static void main(String[] a) {

        addTicket(1, "Ritesh", "Avatar", "A1");
        addTicket(2, "Ram", "Batman", "B3");

        displayTickets();

        deleteTicket(1);

        displayTickets();
    }
}

