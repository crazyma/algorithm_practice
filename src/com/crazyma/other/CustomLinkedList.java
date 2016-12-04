package com.crazyma.other;

/**
 * Created by david on 2016/12/4.
 */
// Java program for reversing the CustomLinkedList list

public class CustomLinkedList {

    public Node head;

    public static class Node {

        public int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the CustomLinkedList list */
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public Node reverseRecursively(Node head){
        if(head == null || head.next == null)
            return head;

        Node second = head.next;
        head.next = null;
        Node rest = reverseRecursively(second);
        second.next = head;

        return rest;
    }

    // prints content of double CustomLinkedList list
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}