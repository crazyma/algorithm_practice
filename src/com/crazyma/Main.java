package com.crazyma;

import com.crazyma.other.FiBonacci;
import com.crazyma.other.NumberUnit;
import com.crazyma.other.StringUnit;

public class Main {

    public static void main(String[] args) {

        FiBonacci.runFabo();

        String string = "David and Cathy";
        StringUnit stringUnit = new StringUnit();
        System.out.println(string + " -> " + stringUnit.reverse(string));
        System.out.println(string + " -> " + stringUnit.reverseRecursively(string));

        System.out.println("101 is palindrome or not ? " + NumberUnit.checkPalindrome(101));
        System.out.println("1000110001 is palindrome or not ? " + NumberUnit.checkPalindrome(1000110001));
        System.out.println("10111 is palindrome or not ? " + NumberUnit.checkPalindrome(10111));
    }
}
