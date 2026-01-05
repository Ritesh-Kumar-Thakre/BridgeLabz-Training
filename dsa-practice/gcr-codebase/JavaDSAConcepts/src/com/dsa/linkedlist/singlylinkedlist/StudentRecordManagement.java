package com.dsa.linkedlist.singlylinkedlist;
import java.util.*;

public class StudentRecordManagement {
	public static Node head = null;
	public static Node tail = null;

	// Add student at end
	public static void addLast(int rollNumber, String name, int age, char grade) {
		Node newNode = new Node(rollNumber, name, age, grade);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	// Add at beginning
	public static void addFirst(int rollNumber, String name, int age, char grade) {
		Node newNode = new Node(rollNumber, name, age, grade);

		newNode.next = head;
		head = newNode;

		if (tail == null)
			tail = newNode;
	}

	// Add at specific position
	public static void addAtPosition(int pos, int rollNumber, String name, int age, char grade) {

		if (pos == 1) {
			addFirst(rollNumber, name, age, grade);
			return;
		}

		Node newNode = new Node(rollNumber, name, age, grade);
		Node temp = head;

		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Invalid position!");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;

		if (newNode.next == null)
			tail = newNode;
	}

	// Display all students
	public static void displayRecords() {

		if (head == null) {
			System.out.println("\nNo student records found.");
			return;
		}

		Node temp = head;
		System.out.println("\n----- Student Records -----");

		while (temp != null) {
			System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: "
					+ temp.grade);
			temp = temp.next;
		}
	}

	// Search student
	public static Node search(int roll) {
		Node temp = head;

		while (temp != null) {
			if (temp.rollNumber == roll)
				return temp;

			temp = temp.next;
		}
		return null;
	}

	// Delete by roll number
	public static void deleteByRoll(int roll) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// delete first node
		if (head.rollNumber == roll) {
			head = head.next;

			if (head == null)
				tail = null;

			System.out.println("Record deleted.");
			return;
		}

		Node temp = head;

		while (temp.next != null && temp.next.rollNumber != roll) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Student not found.");
			return;
		}

		temp.next = temp.next.next;

		if (temp.next == null)
			tail = temp;

		System.out.println("Record deleted.");
	}

	// Update grade
	public static void updateGrade(int roll, char newGrade) {
		Node student = search(roll);

		if (student == null) {
			System.out.println("Student not found.");
			return;
		}

		student.grade = newGrade;
		System.out.println("Grade updated successfully.");
	}

	// MENU
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n---- Student Record Menu ----");
			System.out.println("1. Add at Beginning");
			System.out.println("2. Add at End");
			System.out.println("3. Add at Position");
			System.out.println("4. Delete by Roll Number");
			System.out.println("5. Search Student");
			System.out.println("6. Update Grade");
			System.out.println("7. Display All");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter Roll, Name, Age, Grade:");
				addFirst(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
				break;

			case 2:
				System.out.println("Enter Roll, Name, Age, Grade:");
				addLast(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
				break;

			case 3:
				System.out.println("Enter Position:");
				int pos = sc.nextInt();
				System.out.println("Enter Roll, Name, Age, Grade:");
				addAtPosition(pos, sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
				break;

			case 4:
				System.out.println("Enter Roll to Delete:");
				deleteByRoll(sc.nextInt());
				break;

			case 5:
				System.out.println("Enter Roll to Search:");
				Node s = search(sc.nextInt());
				System.out.println(s == null ? "Student Not Found" : "Found → " + s.name + " (" + s.grade + ")");
				break;

			case 6:
				System.out.println("Enter Roll & New Grade:");
				updateGrade(sc.nextInt(), sc.next().charAt(0));
				break;

			case 7:
				displayRecords();
				break;

			case 8:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
