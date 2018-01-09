package com.crazyma.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2016/12/4.
 */
public class FiBonacci {

    public static void runFabo() {
        int[] array = new int[10];
        fibo(array, 0);
        System.out.print("fobonacci serial : ");
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("the 8th fabo number is " + fibo(8));
    }

    private static void fibo(int[] array, int index) {
        if (array == null || array.length == 0 || index >= array.length)
            return;
        if (index == 0 || index == 1)
            array[index] = 1;
        else
            array[index] = array[index - 1] + array[index - 2];

        fibo(array, index + 1);
    }

    private static int fibo(int index) {
        if (index == 0 || index == 1)
            return 1;
        else
            return fibo(index - 1) + fibo(index - 2);
    }

    //  善用 List 結構的實作，不用 Recursive
    public static List<Integer> getFiboSerial(int length) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);

        while(list.size() < length){
            list.add(list.get(list.size() - 1) + list.get(list.size() - 1));
        }

        return list;
    }


}
