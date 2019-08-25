package com.wenny.bookexample;

import java.util.Random;

/**
 * @author jianwen
 * @since 2019/06/30
 */
public class MaxSubSum {

    public static void main(String[] args) {
        maxSubSum1(initialData(1000));
    }

    public static int[] initialData(int size) {
        Random r = new Random(1);
        int[] a = new int[size];
        for(int i = 0;i < size; i++) {
            int m = r.nextInt(10);
            if (i%2 == 0){
                m = -m;
            }
            a[i] = m;
        }
        return a;
    }

    /**
     * 算法 1：
     * @param a
     * @return
     */
    public static int maxSubSum1(int[] a) {
        long startTime = System.currentTimeMillis();
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];

                    if (thisSum > maxSum) {
                        maxSum = thisSum;
                    }
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(System.currentTimeMillis() - startTime);
        return maxSum;
    }
}
