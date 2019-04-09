package com.vincent.stopthread;

public class StopTest2 {

	
	class StopThread implements Runnable {
		int a = 0;
		@Override
		public void run() {
			System.out.println("开始线程");
			a++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
			System.out.println("// TODO做了个很重要的操作");  
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		StopThread stopThread = new StopTest2().new StopThread();
	}
	
}
