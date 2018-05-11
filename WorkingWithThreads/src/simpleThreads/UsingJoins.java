package simpleThreads;

import java.util.Random;

public class UsingJoins implements Runnable {
	Random var = new Random(System.currentTimeMillis());
	
	@Override
	public void run() {
		for(int i = 0; i < 1000000; i++) {
			var.nextInt();
		}
		
		System.out.println(Thread.currentThread().getName() + " Finishing work");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] useofjoins = new Thread[5];
		for(int i = 0; i < useofjoins.length; i++) {
			useofjoins[i] = new Thread(new UsingJoins(), "useOfThread" + i);
			useofjoins[i].start();
		}
		
		for(int x = 0; x < useofjoins.length; x++) {
			useofjoins[x].join();
		}
		
		System.out.println(Thread.currentThread().getName() + " Finishing");
	}

}
