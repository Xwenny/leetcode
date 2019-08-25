package com.wenny.bookexample.chapter3;

/**
 * @author jianwen
 * @since 2019/08/04
 */
public class Node<E> {
    private Node<E> next;//指向下一个节点
    private E e;//数据域

    public Node() {
    }

    public Node(E e) {
        this.e = e;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
