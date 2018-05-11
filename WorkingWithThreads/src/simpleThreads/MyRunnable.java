package simpleThreads;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		System.out.println(Thread.currentThread().getState());
	}
	
	public static void main(String[] args) {
		MyRunnable myRunObj = new MyRunnable();
		
		Thread mt = new Thread(myRunObj, "Name Of Thread");
		Thread mt2 = new Thread(new MyRunnable(), "Name Of Thread 2");
		
		mt.start();
		mt2.start();
		
		System.out.println(Thread.currentThread().getName() + " Finish");
	}
}
