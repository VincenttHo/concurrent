package com.vincent.stopthread;

public class StopTest {

	class StopThread implements Runnable {
		
		@Override
		public void run() {
			System.out.println("��ʼ�߳�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("// TODO���˸�����Ҫ�Ĳ���");  
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new StopTest().new StopThread());
		thread.start();
		Thread.sleep(100);
		thread.stop();
	}

}
