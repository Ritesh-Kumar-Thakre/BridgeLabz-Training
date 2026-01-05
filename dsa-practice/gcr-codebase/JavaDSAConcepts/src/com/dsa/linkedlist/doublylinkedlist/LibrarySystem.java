package com.dsa.linkedlist.doublylinkedlist;

import java.util.Scanner;

public class LibrarySystem {

    static BookNode head = null, tail = null;

    static void addAtEnd(String t, String a, String g, int id, boolean av) {
        BookNode n = new BookNode(t, a, g, id, av);

        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    static void addAtBeginning(String t, String a, String g, int id, boolean av) {
        BookNode n = new BookNode(t, a, g, id, av);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    static void addAtPosition(String t, String a, String g, int id, boolean av, int pos) {
        if (pos == 1) {
            addAtBeginning(t, a, g, id, av);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(t, a, g, id, av);
            return;
        }

        BookNode n = new BookNode(t, a, g, id, av);
        n.next = temp.next;
        n.prev = temp;
        temp.next.prev = n;
        temp.next = n;
    }

    static void deleteById(int id) {
        if (head == null) return;

        if (head.bookId == id) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) return;

        if (temp == tail) tail = tail.prev;

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    static void searchByTitle(String title) {
        BookNode t = head;
        while (t != null) {
            if (t.title.equalsIgnoreCase(title)) print(t);
            t = t.next;
        }
    }

    static void searchByAuthor(String author) {
        BookNode t = head;
        while (t != null) {
            if (t.author.equalsIgnoreCase(author)) print(t);
            t = t.next;
        }
    }

    static void updateAvailability(int id, boolean status) {
        BookNode t = head;
        while (t != null) {
            if (t.bookId == id) {
                t.available = status;
                return;
            }
            t = t.next;
        }
    }

    static void displayForward() {
            BookNode t = head;
        while (t != null) {
            print(t);
            t = t.next;
        }
    }

    static void displayReverse() {
        BookNode t = tail;
        while (t != null) {
            print(t);
            t = t.prev;
        }
    }

    static void countBooks() {
        int c = 0;
        BookNode t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        System.out.println("Total Books = " + c);
    }

    static void print(BookNode b) {
        System.out.println("ID:" + b.bookId + ", " + b.title +
                " | " + b.author +
                " | " + b.genre +
                " | Available: " + b.available);
    }

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n===== Library System Options =====");
            System.out.print("\n1 Add Beg  \n2 Add End  \n3 Add Pos");
            System.out.print("\n4 Delete   \n5 Search Title  \n6 Search Author");
            System.out.print("\n7 Update Availability  \n8 Display FWD  \n9 Display REV");
            System.out.println("\n10 Count  \n11 Exit");
            System.out.println("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 11) return;

            switch (ch) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Movie: Title, Author, Genre, ID, Available(true/false): ");
                    String t = sc.next(); String a = sc.next(); String g = sc.next();
                    int id = sc.nextInt(); boolean av = sc.nextBoolean();

                    if (ch == 1) addAtBeginning(t, a, g, id, av);
                    else if (ch == 2) addAtEnd(t, a, g, id, av);
                    else {
                        System.out.print("Position: ");
                        addAtPosition(t, a, g, id, av, sc.nextInt());
                    }
                    break;

                case 4:
                    deleteById(sc.nextInt());
                    break;

                case 5:
                    searchByTitle(sc.next());
                    break;

                case 6:
                    searchByAuthor(sc.next());
                    break;

                case 7:
                    updateAvailability(sc.nextInt(), sc.nextBoolean());
                    break;

                case 8:
                    displayForward();
                    break;

                case 9:
                    displayReverse();
                    break;

                case 10:
                    countBooks();
                    break;
            }
        }
    }
}

