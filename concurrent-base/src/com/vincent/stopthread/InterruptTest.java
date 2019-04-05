package com.vincent.stopthread;

public class InterruptTest {

	class InterruptThread implements Runnable {
		int a = 0;
		@Override
		public void run() {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println(a++);
				try {
					Thread.currentThread().wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("stop");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		InterruptThread interruptThread = new InterruptTest().new InterruptThread();
		Thread thread = new Thread(interruptThread);
		thread.start();
		Thread.sleep(100);
		thread.interrupt();
	}
	
}
