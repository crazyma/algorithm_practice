package com.crazyma;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by david on 2018/1/10.
 */
public class JavaTipsUnit {

    public void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public void searchArray(int[] array, int key) {
        Arrays.binarySearch(array, key);
    }

    public void sortList(ArrayList<Integer> list) {
        Collections.sort(list);
        /** 自定義 Comparator  */
        /*
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
         */
    }

}
