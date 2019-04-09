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
			System.out.println(threadName + "------运行开始");
			this.instanceSync.printStr();
			System.out.println(threadName + "------运行结束");
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
			System.out.println(threadName + "------运行开始");
			this.instanceSync.other();
			System.out.println(threadName + "------运行结束");
		}
	}
	
	public static void main(String[] args) {
		// 创建含有对象锁的对象
		InstanceSync instancSync1 = new InstanceSync();
		InstanceSync instancSync2 = new InstanceSync();
		
		// 这里开启的线程所操作的是两个不同的对象，两个线程能同时运行
		TestThread testThread1 = new InstanceSyncTest().new TestThread(instancSync1);
		TestThread2 testThread2 = new InstanceSyncTest().new TestThread2(instancSync1);
		
		// 这里操作的对象是同一个对象，两个线程不能同时运行，一个线程得到锁后，要结束线程释放锁，另一个线程才能得到锁去运行
//		TestThread testThread1 = new InstanceSyncTest().new TestThread(instancSync1);
//		TestThread testThread2 = new InstanceSyncTest().new TestThread(instancSync1);
		
		testThread1.start();
		testThread2.start();
	}
	
}
