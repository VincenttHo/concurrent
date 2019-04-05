package com.vincent.stopthread;

public class StopTest {

	class StopThread implements Runnable {
		
		@Override
		public void run() {
			System.out.println("开始线程");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("// TODO做了个很重要的操作");  
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new StopTest().new StopThread());
		thread.start();
		Thread.sleep(100);
		thread.stop();
	}

}
