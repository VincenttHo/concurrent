package com.vincent.stopthread;

public class StopTest2 {

	
	class StopThread implements Runnable {
		int a = 0;
		@Override
		public void run() {
			System.out.println("��ʼ�߳�");
			a++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
			System.out.println("// TODO���˸�����Ҫ�Ĳ���");  
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		StopThread stopThread = new StopTest2().new StopThread();
	}
	
}
