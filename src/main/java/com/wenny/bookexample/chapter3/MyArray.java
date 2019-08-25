package com.wenny.bookexample.chapter3;

/**
 * @author jianwen
 * @since 2019/08/04
 */
public class MyArray {
    private int[] ints = new int[8];
    private int usedSize;

    public int[] getInts() {
        return ints;
    }

    /**
     * 顺序存储结构的插入
     */
    public MyArray insert(int k, int e) throws Exception {
        if (this.ints.length == this.usedSize) {
            throw new Exception("超过最大尺寸啦");
        }
        if (k < 0 || k > this.ints.length - 1) {
            throw new Exception("k不在范围内");
        }

        for (int i = usedSize - 1; i >= k; i--) {
            this.ints[i + 1] = this.ints[i];
        }

        this.ints[k] = e;
        usedSize++;
        return this;
    }

    /**
     * 顺序存储结构的删除
     */
    public void delete(int k) throws Exception{
        if (this.ints.length == 0){
            throw new Exception("空的");
        }

        if (k < 0 || k > this.ints.length - 1) {
            throw new Exception("k不在范围内");
        }

        if (k == this.ints.length - 1) {
            this.ints[k]=0;
        }
            for (int i = k; i < usedSize-1; i++) {
                this.ints[i] = this.ints[i+1];
                this.ints[i+1] =0;
            }

    }
}
