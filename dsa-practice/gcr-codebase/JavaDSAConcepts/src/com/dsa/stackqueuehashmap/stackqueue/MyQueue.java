package com.dsa.stackqueuehashmap.stackqueue;
import java.util.*;

class MyQueue {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    // Enqueue
    public void enqueue(int x) {
        pushStack.push(x);
    }

    // Move elements only when needed
    private void transfer() {
            while(!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
    }

    // Dequeue
    public int dequeue() {
        if(popStack.isEmpty()) transfer();
        return popStack.pop();
    }

    // Peek
    public int peek() {
        if(popStack.isEmpty()) transfer();
        return popStack.peek();
    }

    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
