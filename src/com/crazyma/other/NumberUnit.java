package com.crazyma.other;

/**
 * Created by david on 2016/12/4.
 */
public class NumberUnit {

    static public boolean checkPalindrome(int target){
        int reverse = 0;
        int number = target;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse == target;
    }

}
