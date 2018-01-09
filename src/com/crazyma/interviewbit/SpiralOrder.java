package com.crazyma.interviewbit;

/**
 * Created by david on 2018/1/8.
 * <p>
 * Interview Bit: Spiral Order Matrix I
 */
public class SpiralOrder {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY


    /**
     *  設定 bounding: top, left, bottom, right
     *  有 direction 設定，所以每次換方向時，都會回到大 loop 檢查是否還可以繼續
     *  有記得要 shift
     *  使用 小 for loop 來處理，所以不會有額外 shift back 的問題
     */
    public int[] officialMethod(final int[][] A) {
        int[] R = new int[A.length * A[0].length];

        int top = 0;
        int left = 0;
        int bottom = A.length - 1;
        int right = A[0].length - 1;
        int count = 0;
        int direction = 0;

        while (left <= right && top <= bottom) {

            // left to right
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    R[count++] = A[top][i];
                }
                top++;
                direction = 1;
            } else if (direction == 1) {
                //  top to bottom
                for (int i = top; i <= bottom; i++) {
                    R[count++] = A[i][right];
                }
                right--;
                direction = 2;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    R[count++] = A[bottom][i];
                }
                bottom--;
                direction = 3;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    R[count++] = A[i][left];
                }
                left++;
                direction = 0;
            }

        }


        return R;
    }

    /**
     * 一次大迴圈，一定要過四個方向，所以切換方向前，都要確認可以進行(checkContinue)
     * 用 globle index: i & j，在 loop 之後 index 會超過，所以得做 shift back
     * 除了上述導致的 shift，本身繞圈的時候，例如往左轉成往下([0,4] > [1][4])，就必須先做一次 shift
     * 用 Ｍark Array 來標示是否拜訪過，也是跳出迴圈的主要依據
     * 原本想要試試看用迴圈做，但是結束狀況不統一，不見得好做
     *
     * @param A
     * @return
     */
    public int[] myMethod(final int[][] A) {

        int[] R = new int[A.length * A[0].length];
        boolean[][] M = new boolean[A.length][A[0].length];

        int i = 0;
        int j = 0;
        int count = 0;

        while (true) {
            if (!checkContinue(i, j, A, M)) break;

            //  go right
            while (j < A[0].length && !M[i][j]) {
                R[count++] = A[i][j];
                M[i][j] = true;
                j++;
            }

            j--;
            i++;
            if (!checkContinue(i, j, A, M)) break;

            //  go down
            while (i < A.length && !M[i][j]) {
                R[count++] = A[i][j];
                M[i][j] = true;
                i++;
            }

            i--;
            j--;
            if (!checkContinue(i, j, A, M)) break;

            //  go left
            while (j >= 0 && !M[i][j]) {
                R[count++] = A[i][j];
                M[i][j] = true;
                j--;
            }

            j++;
            i--;
            if (!checkContinue(i, j, A, M)) break;

            //  go up
            while (i >= 0 && !M[i][j]) {
                R[count++] = A[i][j];
                M[i][j] = true;
                i--;
            }

            i++;
            j++;

        }

        return R;

    }

    private boolean checkContinue(int i, int j, int[][] A, boolean[][] M) {
        return i >= 0 && i < A.length &&
                j >= 0 && j < A[0].length &&
                !M[i][j];
    }

}

