package com.dsa.linkedlist.doublylinkedlist;

public class TextEditorUndoRedo {

    static State current = null;

    static void addState(String t) {
        State n = new State(t);
        n.prev = current;
        if (current != null) current.next = n;
        current = n;
    }

    static void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    static void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    static void show() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] a) {

        addState("Hello");
        addState("Hello World");
        addState("Hello World !!!");

        undo(); show();
        undo(); show();
        redo(); show();
    }
}