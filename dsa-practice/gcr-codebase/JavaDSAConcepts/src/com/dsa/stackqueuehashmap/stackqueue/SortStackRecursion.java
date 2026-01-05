package com.dsa.stackqueuehashmap.stackqueue;

import java.util.*;

public class SortStackRecursion {

    static void sortedInsert(Stack<Integer> st, int x) {
        if(st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        sortedInsert(st, x);
        st.push(top);
    }

    static void sortStack(Stack<Integer> st) {
        if(st.isEmpty()) return;

        int top = st.pop();
        sortStack(st);
        sortedInsert(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(3);
        st.push(2);

        sortStack(st);

        System.out.println("Sorted Stack: " + st);
    }
}

