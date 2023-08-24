package example1;

public class Main {

	public static final int NR_OF_THREADS = 2;

	public static void main(String[] args) {
		Thread[] threads = new Thread[NR_OF_THREADS];

		for (int i = 0; i < NR_OF_THREADS; i++) {
			threads[i] = new MyThread(i);
			threads[i].start();
		}

		for (int i = 0; i < 2; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
