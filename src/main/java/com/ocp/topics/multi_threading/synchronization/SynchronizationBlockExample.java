package com.ocp.topics.multi_threading.synchronization;

class SynchronizationBlockExample {

    void testSynchronizationBlock() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Inside method sync call : ( " + i + " ) Thread Name : " + Thread.currentThread().getName());
            }
        }
    }
}

class ThreadOne extends Thread {
    private SynchronizationBlockExample blockExample;

    ThreadOne(SynchronizationBlockExample blockExample) {
        this.blockExample = blockExample;
    }

    @Override
    public void run() {
        blockExample.testSynchronizationBlock();
    }
}

class ThreadTwo extends Thread {
    private SynchronizationBlockExample blockExample;

    ThreadTwo(SynchronizationBlockExample blockExample) {
        this.blockExample = blockExample;
    }

    @Override
    public void run() {
        blockExample.testSynchronizationBlock();
    }
}

class RunThreadClass {
    public static void main(String[] args) {
        SynchronizationBlockExample blockExample = new SynchronizationBlockExample();
        ThreadOne threadOne = new ThreadOne(blockExample);
        threadOne.setName("ThreadOne");
        ThreadTwo threadTwo = new ThreadTwo(blockExample);
        threadTwo.setName("ThreadTwo");

        threadOne.start();
        threadTwo.start();
    }
}