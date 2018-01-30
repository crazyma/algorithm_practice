package com.crazyma.other;

/**
 * Created by david on 2016/12/4.
 */
public class NumberUnit {

    static public boolean checkPalindrome(int target){
        int reverse = 0;
        int number = target;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse == target;
    }

    static public int[] zeroToTheEnd(int[] array){
        int front = 0;
        int back = array.length - 1;

        int[] result = new int[array.length];

        for (int i = 0;i<array.length;i++) {
            if(array[i] == 0){
                result[back--] = 0;
            }else{
                result[front++] = array[i];
            }
        }

        return result;
    }

    static public boolean isPower(int A) {
        double x=2;
        double i;
        if(A==1) return true;
        for(i=2;(i<33)&&(x<=(double)(Math.pow(2,16)));i++)
        {
            if(Math.pow(x,i)==(double)A) return true;
            if(Math.pow(x,i) >= (Math.pow(2,32))) {i=1;x++;}
        }
        return false;
    }

    public static String intToBinaryString(int x){
        StringBuilder builder = new StringBuilder();
        do{
            builder.insert(0, x%2);
            x = x >> 1;
        }while(x != 0);
        return builder.toString();
    }

    public static int binaryStringToInt(String str){
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int i=0;i<charArray.length;i++){
            count *= 2;
            count += charArray[i] == '1' ? 1 : 0;
        }
        return count;
    }
}
