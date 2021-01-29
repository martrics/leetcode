package com.adam.test;

import java.util.concurrent.Semaphore;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 10:28
 * version: 1.0.0
 */
public class Q1114 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread threadA = new Thread(() -> {
            try {
                foo.first(() -> System.out.println("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadB = new Thread(() -> {
            try {
                foo.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadC = new Thread(() -> {
            try {
                foo.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class Foo {
        private final Semaphore semaphoreOne = new Semaphore(0);
        private final Semaphore semaphoreTwo = new Semaphore(0);

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            semaphoreOne.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {

            // printSecond.run() outputs "second". Do not change or remove this line.
            semaphoreOne.acquire();
            printSecond.run();
            semaphoreTwo.release();
        }

        public void third(Runnable printThird) throws InterruptedException {

            // printThird.run() outputs "third". Do not change or remove this line.
            semaphoreTwo.acquire();
            printThird.run();
        }
    }
}
