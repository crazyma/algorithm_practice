package com.crazyma.codility;

/**
 * Created by david on 2018/1/30.
 */
public class KKBOXTest {

    /**
     * 算出鏈結串列長度
     */
    public static int solution1(int[] A) {
        // write your code in Java SE 8
        int i=0;
        int count = 0;
        while(A[i] != -1){
            count++;
            i = A[i];
        }
        return count;
    }

    /**
     * 重組數自 serial
     * @param N
     */
    public static void solution2(int N){
        for(int i=1;i<=N;i++) {
            StringBuilder builder = new StringBuilder();
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                builder.append(i);
            } else {
                if (i % 3 == 0) {
                    builder.append("Fizz");
                }
                if (i % 5 == 0) {
                    builder.append("Buzz");
                }
                if (i % 7 == 0) {
                    builder.append("Woof");
                }
            }
            System.out.println(builder.toString());
        }
    }

    /**
     *  找出類似的數目，例如 123 回傳 6, 120 回傳 4
     */
    public static int solution3(int N) {
        // write your code in Java SE 8
        int[] sampleArray = new int[10];
        for(int i=0;i<sampleArray.length;i++)
            sampleArray[i] = 0;

        if(N == 0){
            return 1;
        }else{
            while(N != 0){
                int i = N%10;
                sampleArray[i]++;
                N = N / 10;
            }

            int appearCount = 0;
            int d = 1;
            for(int i=0;i<=9;i++){
                if(sampleArray[i] != 0) {
                    appearCount = appearCount + sampleArray[i];
                    d = d * factorial(sampleArray[i]);
                }
            }
            int a = factorial(appearCount);
            int result = a / d;
            int result2 = 0;
            if(sampleArray[0] != 0){
                appearCount = 0;
                d = 1;

                if(sampleArray[0] > 1){
                    appearCount = sampleArray[0] - 1;
                    d = d * factorial(sampleArray[0] - 1);
                }


                for(int i=1;i<=9;i++){
                    if(sampleArray[i] != 0) {
                        appearCount = appearCount + sampleArray[i];
                        d = d * factorial(sampleArray[i]);
                    }
                }
                a = factorial(appearCount);
                result2 = a / d;
            }
            return result - result2;
        }
    }



    public static int factorial(int n){
        int s = 1;
        for(int i = n;i >= 1;i--)
            s = s * i;
        return s;
    }
}
