package singletonSync;

/**
 * DO NOT CHANGE
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
