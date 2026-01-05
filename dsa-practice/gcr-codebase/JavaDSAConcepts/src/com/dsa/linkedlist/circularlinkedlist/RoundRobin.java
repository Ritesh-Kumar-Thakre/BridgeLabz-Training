package com.dsa.linkedlist.circularlinkedlist;

public class RoundRobin {

    static Process head = null;
    static int timeQuantum = 4;

    static void addProcess(int p, int b, int pr) {

        Process n = new Process(p, b, pr);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        Process t = head;
        while (t.next != head) t = t.next;

        t.next = n;
        n.next = head;
    }

    static void simulate() {

        Process t = head;

        while (head != null) {

            System.out.println("Running P" + t.pid);

            t.burst -= timeQuantum;

            if (t.burst <= 0) {
                System.out.println("P" + t.pid + " Completed");
                deleteProcess(t.pid);
            }

            if (head == null) break;

            t = t.next;
        }
    }

    static void deleteProcess(int pid) {

        Process t = head, prev = null;

        if (head.pid == pid) {

            if (head.next == head) {
                head = null;
                return;
            }

            while (t.next != head)
                t = t.next;

            t.next = head.next;
            head = head.next;
            return;
        }

        do {
            prev = t;
            t = t.next;
        } while (t != head && t.pid != pid);

        if (t.pid == pid) prev.next = t.next;
    }

    public static void main(String[] a) {

        addProcess(1, 10, 2);
        addProcess(2, 6, 1);
        addProcess(3, 8, 3);

        simulate();
    }
}
