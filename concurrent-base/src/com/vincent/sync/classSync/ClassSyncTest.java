package com.vincent.sync.classSync;

public class ClassSyncTest {

	class TestThread extends Thread {
		
		private ClassSync classSync;
		
		public TestThread(ClassSync classSync) {
			this.classSync = classSync;
		}
		
		@Override
		public void run() {
			String threadName = this.getName();
			System.out.println(threadName + "------运行开始");
			this.classSync.printStr();
			System.out.println(threadName + "------运行结束");
		}
	}
	
	public static void main(String[] args) {
		// 创建含有对象锁的对象
		ClassSync instancSync1 = new ClassSync();
		ClassSync instancSync2 = new ClassSync();
		
		// 这里开启的线程所操作的是两个不同的对象，两个线程能同时运行
		TestThread testThread1 = new ClassSyncTest().new TestThread(instancSync1);
		TestThread testThread2 = new ClassSyncTest().new TestThread(instancSync2);
		
		// 这里操作的对象是同一个对象，两个线程不能同时运行，一个线程得到锁后，要结束线程释放锁，另一个线程才能得到锁去运行
//		TestThread testThread1 = new classSyncTest().new TestThread(classSync1);
//		TestThread testThread2 = new classSyncTest().new TestThread(classSync1);
		
		testThread1.start();
		testThread2.start();
	}
	
}
