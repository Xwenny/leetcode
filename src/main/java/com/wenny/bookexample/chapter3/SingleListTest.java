package com.wenny.bookexample.chapter3;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jianwen
 * @since 2019/08/04
 */
public class SingleListTest {
    private static String x;

    public static void main(String[] args) {
        MyLinkedList<String> list=new MyLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        for(int i=0;i<list.size();i++){
            System.out.println("输出第"+i+":"+list.getE(i));

        }
        System.out.println();
        System.out.println("测试删除");
        x=list.delete(0);
        System.out.println("删除了"+x);
        for(int i=0;i<=list.size();i++){
            System.out.println("输出第"+i+":"+list.getE(i));

        }
        System.out.println("测试修改");
        list.reNew("Yimi", 2);
        for(int i=1;i<=list.size();i++){
            System.out.println("输出第"+i+":"+list.getE(i));

        }
        System.out.println();
        System.out.println("测试查找");
        x=list.getE(3);
        System.out.println("x="+x);
    }

    /**
     * 头插法测试
     */
    @Test
    public void headAddTest(){
        MyLinkedList<String> list=new MyLinkedList();
        list.add("1");
        list.add("2");
        list.headAdd("3");
        for(int i=0;i<list.size();i++){
            System.out.println("输出第"+i+":"+list.getE(i));
        }
        Assert.assertEquals(list.getE(0), "weiwei");
    }

    /**
     * 整表删除
     */
    @Test
    public void allDeleteTest(){
        MyLinkedList<String> list=new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for(int i=0;i<list.size();i++){
            list.delete(i);
        }
        System.out.println(list);
    }
}
