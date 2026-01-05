package com.dsa.linkedlist.singlylinkedlist;

public class SocialMediaFriends {

    static User head = null;

    static void addUser(int id, String name) {
        User u = new User(id, name);
        u.next = head;
        head = u;
    }

    static User getUser(int id) {
        User t = head;
        while (t != null) {
            if (t.userId == id) return t;
            t = t.next;
        }
        return null;
    }

    static void addFriend(int u1, int u2) {

        User user = getUser(u1);
        if (user == null) return;

        Friend f = new Friend(u2);
        f.next = user.friends;
        user.friends = f;
    }

    static void displayFriends(int id) {
        User u = getUser(id);
        Friend f = u.friends;

        System.out.print("Friends of " + u.name + ": ");

        while (f != null) {
            System.out.print(f.friendId + " ");
            f = f.next;
        }
        System.out.println();
    }

    public static void main(String[] a) {

        addUser(1, "Ritesh");
        addUser(2, "Aman");
        addUser(3, "Meena");

        addFriend(1, 2);
        addFriend(1, 3);

        displayFriends(1);
    }
}

