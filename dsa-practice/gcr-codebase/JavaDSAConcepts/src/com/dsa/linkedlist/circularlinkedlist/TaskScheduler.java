package com.dsa.linkedlist.circularlinkedlist;

import java.util.Scanner;

public class TaskScheduler {
	static Task head = null;
	static Task current = null;

	// Add at end (default)
	public static void addTaskEnd(int id, String name, int priority, String dueDate) {
		Task newNode = new Task(id, name, priority, dueDate);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			current = head;
			return;
		}

		Task temp = head;
		while (temp.next != head)
			temp = temp.next;

		temp.next = newNode;
		newNode.next = head;
	}

	// Add at beginning
	public static void addTaskBeginning(int id, String name, int priority, String dueDate) {
		Task newNode = new Task(id, name, priority, dueDate);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			current = head;
			return;
		}

		Task temp = head;
		while (temp.next != head)
			temp = temp.next;

		newNode.next = head;
		head = newNode;
		temp.next = head;
	}

	// Add at specific position
	public static void addAtPosition(int id, String name, int priority, String dueDate, int pos) {
		if (pos == 1) {
			addTaskBeginning(id, name, priority, dueDate);
			return;
		}

		Task newNode = new Task(id, name, priority, dueDate);
		Task temp = head;

		for (int i = 1; i < pos - 1 && temp.next != head; i++)
			temp = temp.next;

		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete task by ID
	public static void deleteTask(int id) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Task temp = head;
		Task prev = null;

		// deleting head
		if (temp.taskId == id) {

			while (temp.next != head)
				temp = temp.next;

			temp.next = head.next;
			head = head.next;
			System.out.println("Task deleted.");
			return;
		}

		temp = head;

		do {
			prev = temp;
			temp = temp.next;

			if (temp.taskId == id) {
				prev.next = temp.next;
				System.out.println("Task deleted.");
				return;
			}

		} while (temp != head);

		System.out.println("Task not found.");
	}

	// View current task & move next
	public static void viewCurrentTask() {
		if (current == null) {
			System.out.println("No tasks available.");
			return;
		}

		System.out.println("\nCurrent Task:");
		printTask(current);

		current = current.next;
	}

	// Search by priority
	public static void searchByPriority(int p) {
		if (head == null) {
			System.out.println("List empty.");
			return;
		}

		Task temp = head;
		boolean found = false;

		do {
			if (temp.priority == p) {
				printTask(temp);
				found = true;
			}
			temp = temp.next;

		} while (temp != head);

		if (!found)
			System.out.println("No tasks with given priority found.");
	}

	// Display all tasks
	public static void displayTasks() {
		if (head == null) {
			System.out.println("No tasks available.");
			return;
		}

		Task temp = head;

		System.out.println("\n--- Task List ---");
		do {
			printTask(temp);
			temp = temp.next;
		} while (temp != head);
	}

	static void printTask(Task t) {
		System.out.println(
				"TaskID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority + ", Due: " + t.dueDate);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== Task Scheduler Menu =====");
			System.out.println("1. Add Task (Beginning)");
			System.out.println("2. Add Task (End)");
			System.out.println("3. Add Task (At Position)");
			System.out.println("4. Delete Task");
			System.out.println("5. View Current Task & Move Next");
			System.out.println("6. Display All Tasks");
			System.out.println("7. Search by Priority");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
			case 2:
			case 3:
				System.out.print("\nEnter TaskID Name Priority DueDate: ");
				int id = sc.nextInt();
				String name = sc.next();
				int p = sc.nextInt();
				String due = sc.next();

				if (ch == 1)
					addTaskBeginning(id, name, p, due);
				else if (ch == 2)
					addTaskEnd(id, name, p, due);
				else {
					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					addAtPosition(id, name, p, due, pos);
				}
				break;

			case 4:
				System.out.print("Enter Task ID to delete: ");
				deleteTask(sc.nextInt());
				break;

			case 5:
				viewCurrentTask();
				break;

			case 6:
				displayTasks();
				break;

			case 7:
				System.out.print("Enter Priority to search: ");
				searchByPriority(sc.nextInt());
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
