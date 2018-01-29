package com.crazyma.codility;

import java.util.Arrays;

/**
 * Created by david on 2018/1/29.
 */
public class ArrayUnit {

    /**
     * 給定一個長度為奇數的 array
     * 其中所有數字也皆為奇數
     * 所有數字都兩兩配對(paired)除了一個落單
     * 找出該數值
     */
    public static int OddOccurrencesInArray(int[] A){
        Arrays.sort(A);
        for(int i=0;i+1<A.length;i=i+2){
            if(A[i] == A[i+1])
                continue;
            else{
                if(i == 0){
                    return A[0];
                }else{
                    if(A[i-1] != A[i])
                        return A[i];
                    else
                        return A[i+1];
                }
            }
        }

        return A[A.length - 1];
    }

    /**
     * 給一個數字陣列以及數字K，回傳旋轉K次之後的陣列
     * [1,2,3,4,5] k = 2 -> [4,5,1,2,3]
     */
    public static int[] CyclicRotation(int[] A, int K){

        if(A.length == 0)
            return A;

        int size = A.length;
        K = K % size;
        int[] B = new int[size];
        for(int i=0;i<size;i++){
            B[(K+i)%size] = A[i];
        }
        return B;
    }
}
