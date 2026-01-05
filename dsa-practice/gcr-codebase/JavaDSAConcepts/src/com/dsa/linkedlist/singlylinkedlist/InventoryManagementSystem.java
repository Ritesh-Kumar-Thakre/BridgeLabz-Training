package com.dsa.linkedlist.singlylinkedlist;
import java.util.*;

public class InventoryManagementSystem {
	static Item head = null;

    // Add at beginning
    public static void addAtBeginning(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public static void addAtEnd(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        Item temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at specific position
    public static void addAtPosition(String name, int id, int qty, double price, int pos) {

        if (pos == 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }

        Item newNode = new Item(name, id, qty, price);
        Item temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            addAtEnd(name, id, qty, price);
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete item by ID
    public static void deleteById(int id) {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        // delete head
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }

        Item temp = head;

        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Item not found.");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Item deleted.");
    }

    // Update quantity
    public static void updateQuantity(int id, int newQty) {
        Item temp = head;

        while (temp != null) {

            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // Search by ID
    public static void searchById(int id) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // Search by Name
    public static void searchByName(String name) {
        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found.");
    }

    // Calculate total inventory value
    public static void totalInventoryValue() {
        double total = 0;

        Item temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    // Sort by Name / Price
    public static void sortInventory(int choice, boolean ascending) {

        if (head == null || head.next == null)
            return;

        for (Item i = head; i != null; i = i.next) {
            for (Item j = i.next; j != null; j = j.next) {

                boolean condition = false;

                if (choice == 1) { // sort by name
                    condition = ascending ?
                            i.itemName.compareToIgnoreCase(j.itemName) > 0 :
                            i.itemName.compareToIgnoreCase(j.itemName) < 0;

                } else { // sort by price
                    condition = ascending ?
                            i.price > j.price :
                            i.price < j.price;
                }

                if (condition) {
                    // swap values
                    String tn = i.itemName; i.itemName = j.itemName; j.itemName = tn;
                    int tid = i.itemId; i.itemId = j.itemId; j.itemId = tid;
                    int tq = i.quantity; i.quantity = j.quantity; j.quantity = tq;
                    double tp = i.price; i.price = j.price; j.price = tp;
                }
            }
        }

        System.out.println("Inventory sorted successfully.");
    }

    // Display items
    public static void display() {
        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        System.out.println("\n--- Inventory Items ---");
        Item temp = head;

        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    static void printItem(Item i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: " + i.price
        );
    }

    // Main menu
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Inventory Management Menu =====");
            System.out.println("1. Add Item (Beginning)");
            System.out.println("2. Add Item (End)");
            System.out.println("3. Add Item (At Position)");
            System.out.println("4. Delete Item by ID");
            System.out.println("5. Update Item Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Display Inventory");
            System.out.println("9. Calculate Total Inventory Value");
            System.out.println("10. Sort by Name");
            System.out.println("11. Sort by Price");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                case 2:
                case 3:
                    System.out.print("\nEnter Item - Name, ID, Quantity, Price: ");
                    String name = sc.next();
                    int id = sc.nextInt();
                    int qty = sc.nextInt();
                    double price = sc.nextDouble();

                    if (ch == 1)
                        addAtBeginning(name, id, qty, price);
                    else if (ch == 2)
                        addAtEnd(name, id, qty, price);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        addAtPosition(name, id, qty, price, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID to delete: ");
                    deleteById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Item ID to update quantity: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    updateQuantity(uid, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Item ID to search: ");
                    searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter Item Name to search: ");
                    searchByName(sc.next());
                    break;

                case 8:
                    display();
                    break;

                case 9:
                    totalInventoryValue();
                    break;

                case 10:
                    System.out.println("Sort Ascending? (true/false)");
                    sortInventory(1, sc.nextBoolean());
                    break;

                case 11:
                    System.out.println("Sort Ascending? (true/false)");
                    sortInventory(2, sc.nextBoolean());
                    break;

                case 12:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
