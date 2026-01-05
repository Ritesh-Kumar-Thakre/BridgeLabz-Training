package com.dsa.stackqueuehashmap.stackqueue;
import java.util.*;

public class StockSpan {

    public static int[] calculateSpan(int prices[]) {

        Stack<Integer> st = new Stack<>();
        int span[] = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {

            while(!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }

            span[i] = (st.isEmpty()) ? (i+1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {

        int prices[] = {100, 80, 60, 70, 60, 75, 85};

        int span[] = calculateSpan(prices);

        System.out.println("Stock Span Values:");
        for(int x : span) System.out.print(x + " ");
    }
}
