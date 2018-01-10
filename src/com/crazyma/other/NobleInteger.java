package com.crazyma.other;

import java.util.Arrays;

/**
 * Created by david on 2018/1/10.
 *
 * Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
 * If such an integer is found return 1 else return -1.
 */
public class NobleInteger {
    public int solve(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++){
            if (i == A.length - 1){
                if (A[i] == 0)
                    return 1;
                else
                    return -1;
            }

            if (A[i+1] == A[i]){
                continue;
            }else{
                if (A.length - i - 1 == A[i]){
                    return 1;
                }
            }
        }
        return -1;
    }
}
