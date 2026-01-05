package com.dsa.stackqueuehashmap.hashmap;
import java.util.LinkedList;

public class MyHashMap<K, V> {

    // Node to store key-value pair
    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private int size = 0;

    // Array of LinkedLists (separate chaining)
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert or Update Key
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;   // update existing value
                return;
            }
        }

        bucket.add(new Node(key, value));  // insert new pair
        size++;
    }

    // Retrieve value
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // not found
    }

    // Remove key
    public boolean remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return true;
            }
        }
        return false;
    }

    // Check key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Map size
    public int size() {
        return size;
    }

    // Display HashMap
    public void display() {
        System.out.println("\nHashMap Contents:");

        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + " -> ");

            for (Node node : buckets[i]) {
                System.out.print("[" + node.key + " = " + node.value + "] ");
            }
            System.out.println();
        }
    }

    // Test Program
    public static void main(String[] args) {

        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(101, "Ritesh");
        map.put(102, "Neha");
        map.put(103, "Aman");
        map.put(104, "Raj");

        map.display();

        System.out.println("\nGet 102 → " + map.get(102));

        map.put(102, "Neha Sharma");  // update value

        System.out.println("\nAfter update:");
        map.display();

        map.remove(103);

        System.out.println("\nAfter removing 103:");
        map.display();

        System.out.println("\nContains 101? " + map.containsKey(101));
        System.out.println("Map Size = " + map.size());
    }
}
