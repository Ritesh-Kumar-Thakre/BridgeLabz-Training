package com.dsa.linkedlist.circularlinkedlist;

public class Task {
	int taskId;
    String taskName;
    int priority;
    String dueDate;

    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
