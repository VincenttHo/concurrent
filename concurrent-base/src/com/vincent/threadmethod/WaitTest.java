package com.vincent.threadmethod;

public class WaitTest {

	class WaitThread implements Runnable {
		@Override
		public void run() {
			synchronized (this) {
				int a = 0;
				while(true) {
					System.out.println(a++);
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WaitThread waitThread = new WaitTest().new WaitThread();
		Thread thread = new Thread(waitThread);
		synchronized (waitThread) {
			thread.start();
			waitThread.wait();
//			Thread.sleep(1000000);
		}
	}
	
}
