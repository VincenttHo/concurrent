package com.vincent.sync.instanceSync;

public class InstanceSyncTest {

	class TestThread extends Thread {
		
		private InstanceSync instanceSync;
		
		public TestThread(InstanceSync instanceSync) {
			this.instanceSync = instanceSync;
		}
		
		@Override
		public void run() {
			String threadName = this.getName();
			System.out.println(threadName + "------���п�ʼ");
			this.instanceSync.printStr();
			System.out.println(threadName + "------���н���");
		}
	}
	
	class TestThread2 extends Thread {
		
		private InstanceSync instanceSync;
		
		public TestThread2(InstanceSync instanceSync) {
			this.instanceSync = instanceSync;
		}
		
		@Override
		public void run() {
			String threadName = this.getName();
			System.out.println(threadName + "------���п�ʼ");
			this.instanceSync.other();
			System.out.println(threadName + "------���н���");
		}
	}
	
	public static void main(String[] args) {
		// �������ж������Ķ���
		InstanceSync instancSync1 = new InstanceSync();
		InstanceSync instancSync2 = new InstanceSync();
		
		// ���￪�����߳�����������������ͬ�Ķ��������߳���ͬʱ����
		TestThread testThread1 = new InstanceSyncTest().new TestThread(instancSync1);
		TestThread2 testThread2 = new InstanceSyncTest().new TestThread2(instancSync1);
		
		// ��������Ķ�����ͬһ�����������̲߳���ͬʱ���У�һ���̵߳õ�����Ҫ�����߳��ͷ�������һ���̲߳��ܵõ���ȥ����
//		TestThread testThread1 = new InstanceSyncTest().new TestThread(instancSync1);
//		TestThread testThread2 = new InstanceSyncTest().new TestThread(instancSync1);
		
		testThread1.start();
		testThread2.start();
	}
	
}
