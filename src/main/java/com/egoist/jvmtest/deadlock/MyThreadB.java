package com.egoist.jvmtest.deadlock;

class MyThreadB extends Thread {
    private ResourceA rA;
    private ResourceB rB ;
    private String threadName;
    public MyThreadB(ResourceA resourceA, ResourceB resourceB) {
        this.rA = resourceA;
        this.rB = resourceB;
    }
    @Override
    public void run() {
        threadName = Thread.currentThread().getName();
        consumeResource();

    }
    public void consumeResource(){
        synchronized (this.rB){
            if(!this.rB.getResourceB().equals(threadName)){
                this.rB.consumerB(threadName);
                System.out.println(this.threadName + " 消费 B");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this.rA){
                if(!this.rA.getResourceA().equals(threadName)){
                    this.rA.consumerA(threadName);
                    System.out.println(this.threadName + " 消费 A");
                }
            }

        }
    }
}
