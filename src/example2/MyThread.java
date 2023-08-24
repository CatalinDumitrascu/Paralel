package example2;


import example2.Main;

public class MyThread extends Thread {
    
    private int threadId;
    
    public MyThread(int threadId) {
        this.threadId = threadId;
    }
    public MyThread(){}
    
    @Override
    public void run() {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(Main.SECONDS_TO_SLEEP[threadId]);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread with id: " + threadId + " finished in " + (System.currentTimeMillis() - start) + " ms");
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }
}
