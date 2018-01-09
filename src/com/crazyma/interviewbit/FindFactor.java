package com.crazyma.interviewbit;

import java.util.ArrayList;

/**
 * Created by david on 2018/1/9.
 */
public class FindFactor {

    public static ArrayList<Integer> findAllFactor(int target) {
        ArrayList<Integer> list = new ArrayList<>();

        //  too slow
        /*
        for (int i = 1; i <= target; i++) {
            if(target % i == 0)
                list.add(i);
        }
        */

        //  faster
        int sqrt = (int) Math.sqrt(target);
        for (int i = 1; i <= sqrt; i++) {
            if (target % i == 0)
                list.add(i);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            int q = list.get(i);

            if (target / q == q) continue;

            list.add(target / q);
        }


        return list;
    }

}
