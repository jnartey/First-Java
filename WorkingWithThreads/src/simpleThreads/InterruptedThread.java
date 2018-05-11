package simpleThreads;

public class InterruptedThread implements Runnable{

	@Override
	public void run() {
		int counter = 5;
		int sub = 10;
		int result = counter-- - --sub;
		System.out.println(counter);
		int rep = counter-- - --counter;
		System.out.println("rep = " + rep);
		System.out.println("result = " + result);
		
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " was interrupted");
		}
		
		while(!Thread.interrupted()) {
			System.out.println("In while loop");
		}
		
		System.out.println(Thread.currentThread().getName() + " About to finish");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread ownThread = new Thread(new InterruptedThread(), "Thread to be interrupted");
		
		System.out.println("Started ownThread");
		ownThread.start();
		
		System.out.println("Main going to sleep for 3 secs");
		Thread.sleep(3000);
		
		System.out.println("About to interrupt ownThread");
		ownThread.interrupt();
		
		System.out.println("Main going to sleep for 3 secs again");
		Thread.sleep(3000);
		
		System.out.println("About to interrupt ownThread again");
		ownThread.interrupt();
		
		
	}

}
