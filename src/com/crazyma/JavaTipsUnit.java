package com.crazyma;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by david on 2018/1/10.
 *
 * 需要追蹤一下 Node, Stack, Queue 的使用
 */
public class JavaTipsUnit {

    public void sortArray(String[] array) {
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }

    public void searchArray(int[] array, int key) {
        Arrays.binarySearch(array, key);
    }

    public void sortList(ArrayList<Integer> list) {
        Collections.sort(list);
        /** 自定義 Comparator , 回傳為正, 表示 o1 > o2; 回傳為負 表示 o1 < o2; 回傳為0 表示 o1 == o2*/
        /*
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
         */
    }

    public void getAllKeyofMap(Map<Integer, Object> map) {
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }

}
