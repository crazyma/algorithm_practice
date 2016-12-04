package com.crazyma.other;

/**
 * Created by david on 2016/12/4.
 */
public class FiBonacci {

    public static void runFabo(){
        int[] array = new int[10];
        fibo(array,0);
        System.out.print("fobonacci serial : ");
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    private static void fibo(int[] array, int index){
        if(array == null || array.length == 0 || index >= array.length)
            return;
        if(index == 0 || index == 1)
            array[index] = 1;
        else
            array[index] = array[index-1] + array[index-2];

        fibo(array,index+1);
    }



}
