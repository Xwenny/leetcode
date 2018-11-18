package com.wenny.leetcode.easy.num_000007;



import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: jianwen
 * @Date: 2018/11/18 下午3:24
 */
public class Solution {

    public int reverse(int x) {
        int revertNum = 0;
        while (x != 0){
            int a = x % 10;
            if (revertNum > Integer.MAX_VALUE / 10 || (revertNum == Integer.MAX_VALUE / 10 && a > 7)) return 0;
            if (revertNum < Integer.MIN_VALUE / 10 || (revertNum == Integer.MIN_VALUE / 10 && a < -8)) return 0;
            revertNum = revertNum*10 + a;
            x = x / 10;
        }
        System.out.println(revertNum);
        return revertNum;
    }

    @Test
    public void test(){
        Assert.assertEquals(54321,reverse(12345));
        Assert.assertEquals(-54321,reverse(-12345));

    }
}
