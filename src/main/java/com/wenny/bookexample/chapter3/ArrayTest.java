package com.wenny.bookexample.chapter3;

import org.junit.Test;

/**
 * @author jianwen
 * @since 2019/08/04
 */
public class ArrayTest {

    /**
     * 顺序存储结构的插入和删除
     */
    @Test
    public void insertAndDelete() throws Exception {
        MyArray myArray = new MyArray();
        myArray.insert(0, 1);
        print(myArray.getInts());

        myArray.insert(1, 2);
        print(myArray.getInts());

        myArray.insert(2, 3);
        print(myArray.getInts());

        myArray.insert(3, 4);
        print(myArray.getInts());

        myArray.insert(2, 5);
        print(myArray.getInts());

        myArray.insert(2, 6);
        print(myArray.getInts());

        myArray.insert(2, 7);
        print(myArray.getInts());

        myArray.insert(2, 8);
        print(myArray.getInts());

        myArray.delete(7);
        print(myArray.getInts());
        myArray.delete(0);
        print(myArray.getInts());
        myArray.delete(5);
        print(myArray.getInts());
    }

    private void print(int[] ints){
        for (int i=0;i<=ints.length-1;i++){
            System.out.print(ints[i]+" ");
        }
        System.out.println();
    }
}
