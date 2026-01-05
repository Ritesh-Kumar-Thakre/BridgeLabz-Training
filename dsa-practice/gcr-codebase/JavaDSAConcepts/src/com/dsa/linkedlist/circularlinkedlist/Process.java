package com.dsa.linkedlist.circularlinkedlist;

class Process {
    int pid, burst, priority;
    Process next;

    Process(int p, int b, int pr) {
        pid = p;
        burst = b;
        priority = pr;
        next = null;
    }
}