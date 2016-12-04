package com.crazyma;

import com.crazyma.other.*;

public class Main {

    public static void main(String[] args) {

        FiBonacci.runFabo();

        String string = "David and Cathy";
        StringUnit stringUnit = new StringUnit();
        System.out.println(string + " -> " + stringUnit.reverse(string));
        System.out.println(string + " -> " + stringUnit.reverseRecursively(string));

        System.out.println("--------------------------");

        System.out.println("101 is palindrome or not ? " + NumberUnit.checkPalindrome(101));
        System.out.println("1000110001 is palindrome or not ? " + NumberUnit.checkPalindrome(1000110001));
        System.out.println("10111 is palindrome or not ? " + NumberUnit.checkPalindrome(10111));

        System.out.println("--------------------------");

        CustomLinkedList list = new CustomLinkedList();
        list.head = new CustomLinkedList.Node(4);
        list.head.next = new CustomLinkedList.Node(74);
        list.head.next.next = new CustomLinkedList.Node(26);
        list.head.next.next.next = new CustomLinkedList.Node(64);
        list.printList(list.head);
        System.out.println();
        list.head = list.reverse(list.head);
        list.printList(list.head);
        System.out.println();
        list.head = list.reverseRecursively(list.head);
        list.printList(list.head);
        System.out.println();

        System.out.println("--------------------------");

        int[] intArray = {5,2,0,5,0,0,2,0,4};
        int[] sortedArray = NumberUnit.zeroToTheEnd(intArray);
        for (int i : sortedArray) {
            System.out.print(" " + i);
        }

        System.out.println("\n--------------------------");

        SortUnit sortUnit = new SortUnit();
        sortUnit.quickSort();

        System.out.println("\n--------------------------");

        SearchUnit searchUnit = new SearchUnit();
        int index = searchUnit.binarySearch(32);
        System.out.println("index = " + index);

        System.out.println("--------------------------");

    }
}
