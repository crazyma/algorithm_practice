package com.crazyma;

import com.crazyma.interviewbit.FindFactor;
import com.crazyma.interviewbit.MathUtils;
import com.crazyma.interviewbit.MergeIntervals;
import com.crazyma.interviewbit.SpiralOrder;
import com.crazyma.other.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }





    //////////////////////////////////////////////////////////////////////////////////////////

    private static void runTree(){
        System.out.println("\n-----   Tree   --------");
        TreeUnit.Node root = null;

        TreeUnit.RecursiveBinarySearchTree rbSearchTree = new TreeUnit.RecursiveBinarySearchTree();

        root = rbSearchTree.insert(root, 4);
        root = rbSearchTree.insert(root, 1);
        root = rbSearchTree.insert(root, 7);
        root = rbSearchTree.insert(root, 2);
        root = rbSearchTree.insert(root, 0);
        root = rbSearchTree.insert(root, 8);

        System.out.println("exist : " +  rbSearchTree.isExist(root, 5));

        rbSearchTree.postOrderPrint(root);
        System.out.println("\n");

        TreeUnit.BinarySearchTree bSearchTree = new TreeUnit.BinarySearchTree();
        bSearchTree.insert(4);
        bSearchTree.insert(1);
        bSearchTree.insert(7);
        bSearchTree.insert(2);
        bSearchTree.insert(0);
        bSearchTree.insert(8);
        System.out.println("exist : " +  bSearchTree.isExist(3));
        System.out.print("tree : " + bSearchTree.getRoot().value);

        System.out.println("\n--------------------------");
    }

    private static void findFactor(int target) {
        System.out.println("\n-----   find factor   --------");
        List<Integer> list = FindFactor.findAllFactor(target);
        System.out.print("factor of " + target + ": ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("\n--------------------------");
    }

    private static void findGCD(int a, int b) {
        System.out.println("\n-----   find GCD   --------");
        MathUtils.GCDUnit gcdUnit = new MathUtils.GCDUnit();
        int gcd = gcdUnit.get(a, b);
        System.out.print("gcd of " + a + " and " + b + ": " + gcd);
        System.out.println("\n--------------------------");
    }

    private static void reverseNumberCheck() {
        System.out.println("\n-----  reverse number check  --------");
        MathUtils.reverseNumber reverseNumber = new MathUtils.reverseNumber();
        boolean r = reverseNumber.shitPalindromeCheck(1311131);
        System.out.println(r);
        System.out.println("\n--------------------------");
    }

    private static void mergeIntervals() {
        System.out.println("\n-----   merge interval   --------");
        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.run();
        System.out.println("\n--------------------------");
    }

    private static void runFabo() {
        System.out.println("\n-------   Fabo  ----------");
        FiBonacci.runFabo();

        List<Integer> fiboSerial = FiBonacci.getFiboSerial(20);
        for (Integer integer : fiboSerial) {
            System.out.println(" " + integer + " ");
        }
        System.out.println("\n--------------------------");
    }

    private static void runSpiralOrder() {
        System.out.println("\n-------   Spiral Order  ----------");
        int[][] A = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};

        int[] R = new SpiralOrder().officialMethod(A);

        for (int i : R) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------");
    }

    private static void runStringOperation() {
        System.out.println("\n-------   String  ----------");
        String string = "David and Cathy";
        StringUnit stringUnit = new StringUnit();
        System.out.println(string + " -> " + stringUnit.reverse(string));
        System.out.println(string + " -> " + stringUnit.reverseRecursively(string));
        System.out.println("\n--------------------------");
    }

    private static void runNumberOperation() {
        System.out.println("\n-------   Number  ----------");
        System.out.println("101 is palindrome or not ? " + NumberUnit.checkPalindrome(101));
        System.out.println("1000110001 is palindrome or not ? " + NumberUnit.checkPalindrome(1000110001));
        System.out.println("10111 is palindrome or not ? " + NumberUnit.checkPalindrome(10111));


        int[] intArray = {5, 2, 0, 5, 0, 0, 2, 0, 4};
        int[] sortedArray = NumberUnit.zeroToTheEnd(intArray);
        for (int i : sortedArray) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("prime number : " + NumberUnit.isPower(3559));

        System.out.println("\n--------------------------");
    }

    private static void runLinkedList() {

        System.out.println("\n-------   Linked List  ----------");
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
        System.out.println("\n--------------------------");
    }

    private static void runSort() {
        System.out.println("\n-------    Soring    -----------");
        SortUnit sortUnit = new SortUnit();
        sortUnit.heapSort();

        System.out.println("\n--------------------------");
    }

    private static void runSearch() {
        System.out.println("\n--------    search     ----------");
        SearchUnit searchUnit = new SearchUnit();
        int index = searchUnit.binarySearch(2);
        System.out.println("index = " + index);

        int[] searchArray = {15, 24, 37, 42, 53, 68, 72, 85, 97};
        System.out.println(
                "index = " + searchUnit.binarySearchRecursively(searchArray, 0, searchArray.length - 1, 94)
        );
        System.out.println("\n--------------------------");
    }

    private static void collectionOperation() {
        System.out.println("\n--------    collection     ----------");
        CollectionUnit collectionUnit = new CollectionUnit();
        collectionUnit.testHashMap();
        System.out.println();
        collectionUnit.testHashSet();
        System.out.println();
        System.out.println("\n--------------------------");
    }
}
