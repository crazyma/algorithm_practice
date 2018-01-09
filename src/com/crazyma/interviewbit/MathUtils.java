package com.crazyma.interviewbit;

/**
 * Created by david on 2018/1/9.
 */
public class MathUtils {


    /**
     * 要注意
     * 1. 大小有別
     * 2. Zero
     */
    public static class GCDUnit {

        public int get(int a,int b){
            return officialMethod(a,b);
        }

        public int fastMethod(int a, int b){
            if(a == 0)
                return b;
            if(a == b)
                return b;
            if(a > b)
                return fastMethod(b, a);
            if(a == 1)
                return 1;
            if(b%a == 0)
                return a;
            else
                return fastMethod(b%a, a);
        }

        /**
         * 1. recursive
         * 2. 沒有處理到 a b 大小的問題(不一定 a < b) => 其實有，recursive 的時候自動會換 XD
         */
        public int officialMethod(int a, int b) {
            if(a == 0)
                return b;
            else
                return officialMethod(b%a, a);
        }

        /**
         * 不夠聰明
         * 沒有使用到 Recursive
         */
        public int myMethod(int a, int b) {
            int big, small;
            if (a >= b) {
                big = a;
                small = b;
            } else {
                big = b;
                small = a;
            }

            if (small == 0)
                return big;

            while (big % small != 0) {
                int r = big - (big / small) * small;    //  當下沒想到要用 big % small ...
                big = small;
                small = r;
            }
            return small;
        }
    }


}
