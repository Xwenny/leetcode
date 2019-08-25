package com.wenny.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jianwen
 * @since 2019/08/25
 */
public class DeadLockTest {

    public static void main(String[] args) {
        final ReentrantLock lock1 = new ReentrantLock();
        final ReentrantLock lock2 = new ReentrantLock();

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock1.lock();
                System.out.println(Thread.currentThread().getName() + "lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock2.lock();
                System.out.println(Thread.currentThread().getName() + "lock2");

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock2.lock();
                System.out.println(Thread.currentThread().getName() + "lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock1.lock();
                System.out.println(Thread.currentThread().getName() + "lock1");
            }
        });
        thread1.start();
        thread2.start();
    }
}
