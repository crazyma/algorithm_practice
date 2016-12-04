package com.crazyma.other;

/**
 * Created by david on 2016/12/4.
 */
public class StringUnit {

    public String reverse(String string){
        StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }

        return builder.toString();
    }

    public String reverseRecursively(String string){
        if(string.length() <= 1)
            return string;
        else
            return reverseRecursively(string.substring(1)) + string.charAt(0);
    }

}
