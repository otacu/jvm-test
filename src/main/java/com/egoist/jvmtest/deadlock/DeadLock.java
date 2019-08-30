package com.egoist.jvmtest.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        MyThreadA threadA = new MyThreadA(resourceA, resourceB );
        MyThreadB threadB = new MyThreadB(resourceA, resourceB );
        threadA.start();
        threadB.start();
    }
}
