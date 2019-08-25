package com.wenny.bookexample.chapter3;

/**
 * @author jianwen
 * @since 2019/08/04
 */
public class MyLinkedList<E> {
    //声明头结点
    private Node<E> head;

    //声明尾节点
    private Node<E> last;

    //链表的大小
    private int size;
    //计算修改表的次数
    private int modCount;

    public MyLinkedList(){
        head = new Node<>();
        last = head;
    }

    //获取单链表中存储的元素总数
    public int size(){
        return size;
    }

    //获取指定索引位置的节点对象
    private Node<E> select(int index){
        Node<E> node = head.getNext();//将头节点的下一个节点赋给 node
        for (int i=0; i<index; i++){
            node = node.getNext();//获取 node 的下一个节点
        }
        return node;
    }

    //找到指定节点的数据域，并返回
    public E getE(int index){
        if (index < 0 || index > size -1){
            return null;
        }
        Node<E> node = select(index);//查找指定索引位置的节点对象
        return node.getE();//获取节点中的数据域元素并返回
    }

    //增加元素（尾插）
    public void add(E e){
        Node<E> node = new Node<>(e);//以 e 实例化一个节点
        last.setNext(node);//往尾节点后加节点
        last = node;
        size++;
    }

    //增加元素(头插)
    public void headAdd(E e){
        Node<E> node = new Node<>(e);//以 e 实例化一个节点
        node.setNext(head.getNext());
        head.setNext(node);//往头节点后加节点
        size++;
    }


    //删除指定的节点 e，并返回 e
    public E delete(int index){
        if (index < 0 || index > size){
            return null;
        }
        if (index == 0){//当索引为 1 时，令头节点的下一个节点为头节点
            Node<E> node2 = head.getNext();
            head.setNext(node2.getNext());
            size--;
            return node2.getE();
        }

        //获取要删除节点的前一点节点
        Node<E> bNode = select(index - 1);
        //获取要删除的节点
        Node<E> node = bNode.getNext();
        //获取要删除节点的后一个节点
        Node<E> nNode = node.getNext();

        // 先建立删除节点的前一个节点和删除节点的后一个节点的关系
        bNode.setNext(nNode);
        // 清除dNode的下一个节点
        node.setNext(null);
        size--;// 计数器减1
        return node.getE();// 返回删除节点中的数据域
    }

    //修改指定位置的数据域
    public E reNew(E x,int index){
        if (index < 0 || index > size || size == 0)
            return null;
        Node<E> xNode = new Node<>(x);//获取一个新节点
        Node<E> node = select(index);
        node.setE(xNode.getE());
        return node.getE();
    }

    //整表删除
    public boolean allDelete(MyLinkedList linkedList){

        return true;
    }
}
