package com.crazyma.other;

/**
 * Created by david-air on 2016/12/4.
 */
public class SearchUnit {

    private int[] sampleArray = {1, 3, 4, 6, 7, 26, 27, 32, 34, 36, 44, 62, 64, 70, 93};

    public int binarySearch(int target) {
        int mid = 0;
        int left = 0;
        int right = sampleArray.length - 1;

        while (left >= 0 && right < sampleArray.length && left <= right) {
            mid = (left + right) / 2;
            if (sampleArray[mid] == target)
                return mid;
            else if (sampleArray[mid] < target) { // search right part
                left = mid + 1;
            } else {  //  search left part
                right = mid - 1;
            }
        }

        return -1;
    }

    public int binarySearchRecursively(int[] array, int left, int right, int target) {

        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (array[mid] < target) {
            return binarySearchRecursively(array, mid + 1, right, target);
        } else if (array[mid] > target) {
            return binarySearchRecursively(array, left, mid - 1, target);
        } else {
            return mid;
        }
    }

}
