package example2;

public class Main {

	public static final int NR_OF_THREADS = 4;
	public static final int[] SECONDS_TO_SLEEP = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000};


	public static void main(String[] args) {
		Thread[] threads = new Thread[NR_OF_THREADS];

		long start = System.currentTimeMillis();
		for (int i = 0; i < NR_OF_THREADS; i++) {
			threads[i] = new MyThread(i);
			threads[i].start();
		}

		for (int i = 0; i < NR_OF_THREADS; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("All threads finished in: " + (System.currentTimeMillis() - start) + " ms");
	}
}
