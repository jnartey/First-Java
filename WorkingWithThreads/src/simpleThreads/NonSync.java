package simpleThreads;

public class NonSync implements Runnable {
	
	private static Integer num = 0;

	@Override
	public void run() {
		//synchronized(NonSync.class) {
			while(num < 20) {
				synchronized(num) {
					System.out.println(Thread.currentThread().getName() + " Reading " + num);
					num++;
					System.out.println(Thread.currentThread().getName() + " Next Values " + num);
				}
			}
		//}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] nonSync = new Thread[5];
		
		for(int i = 0; i < nonSync.length; i++) {
			nonSync[i] = new Thread(new NonSync(), "NonSync" + i);
			nonSync[i].start();
		}
		
		for(int x = 0; x < nonSync.length; x++) {
			nonSync[x].join();
		}
	}
}
