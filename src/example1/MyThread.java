package example1;


public class MyThread extends Thread {
    
    private int threadId;
    
    public MyThread(int threadId) {
        this.threadId = threadId;
    }
    public MyThread(){}
    
    @Override
    public void run() {
        System.out.println("Hello world from thread with id: " + threadId);
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }
}
