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

    static public int[] zeroToTheEnd(int[] array){
        int front = 0;
        int back = array.length - 1;

        int[] result = new int[array.length];

        for (int i = 0;i<array.length;i++) {
            if(array[i] == 0){
                result[back--] = 0;
            }else{
                result[front++] = array[i];
            }
        }

        return result;
    }

}
