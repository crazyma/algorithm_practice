package com.crazyma.codility;

/**
 * Created by david on 2018/1/30.
 */
public class Iterations {
    //  算出一個數字轉成 binary 之後，前後被1包圍的0的最長長度，例如 100101 要回傳 2, 10100 要回傳 1
    public static int binaryGap(int N){
        int count = 0;
        int max = 0;

        boolean startWithEven = N%2==0;

        do{
            if(N%2 == 0){
                if(!startWithEven)
                    count++;
            }else{
                startWithEven = false;
                max = Math.max(max,count);
                count = 0;
            }
            N = N >> 1;
        }while(N !=0);

        return max;
    }

    /**
     *  給訂一個數字陣列，找出最小的 missing 數字
     *  [1,2,3] -> 4    [1,2,3,5,6,7] -> 4
     */
    public static int missInteger(int[] A){
        boolean[] array = new boolean[1000000];
        for(int i=0;i<A.length;i++){
            if(A[i] >=1 ){
                array[A[i]] = true;
            }
        }
        int i;
        for(i=1;i<array.length;i++){
            if(array[i] == false)
                break;
        }
        return i;
    }
}
