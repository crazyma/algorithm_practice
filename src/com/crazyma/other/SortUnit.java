package com.crazyma.other;

import java.util.Arrays;

/**
 * Created by david-air on 2016/12/4.
 */
public class SortUnit {

    private int[] sampleArray = {3,64,34,26,93,1,6,32,70,36,44,62,36,7,4,27};

    private int[] cloneSampleArray(){
        return Arrays.copyOf(sampleArray,sampleArray.length);
    }

    private void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print(int[] array){
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    /**
     * O(n^2) O(n^2)  O(n^2)
     */
    public void selectionSort(){
        int[] array = cloneSampleArray();

        int min_index;
        for(int i=0 ;i< array.length;i++){
            min_index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min_index] > array[j]){
                    min_index = j;
                }
            }
            swap(array,min_index,i);
        }

        print(array);
    }

    /**
     * O(n) O(n^2)  O(n^2)
     */
    public void bubbleSort(){
        int[] array = cloneSampleArray();

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1])
                    swap(array,j,j+1);
            }
        }

        print(array);
    }

    /**
     * O(n) O(n^2)  O(n^2)
     */
    public void gnomeSort(){
        int[] array = cloneSampleArray();

        int count = 0;
        for(int i=0;i<array.length;){
            if(i == 0 || array[i-1] <= array[i]){
                i++;
            }else{
                swap(array,i,i-1);
                i--;
            }
        }
        print(array);
    }

    /**
     * O(n) O(n^2)  O(n^2)
     */
    public void insertSort(){
        int[] array = cloneSampleArray();

        //  可以直接從 index 1 開始
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j-1] > array[j]){
                    swap(array,j-1,j);
                }
            }
        }

        print(array);
    }

    /**
     * O(n log n) O(n^2)  O(n log n)
     */
    public void quickSort(){
        int[] array = cloneSampleArray();
        quickOperation(array,0,array.length-1);
        print(array);
    }

    //  let the array[left] be the pivot
    private void quickOperation(int[] array,int left,int right){
        if(left < right) {
            int i = left;
            int j = right + 1;
            while (true) {
                while (i+1 < array.length && array[++i] < array[left]);
                while(j-1 > -1 && array[--j] > array[left]);
                if(j <= i)
                    break;

                swap(array,i,j);
            }

            swap(array,left,j); //  ATTENTION, 這裡的交換對象是 Left(Pivot) & j(從右邊往左移動的那位)
            quickOperation(array,left,j-1);
            quickOperation(array,j+1,right);
        }
    }

}
