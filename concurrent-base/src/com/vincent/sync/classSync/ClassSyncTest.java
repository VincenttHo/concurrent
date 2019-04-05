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
			System.out.println(threadName + "------���п�ʼ");
			this.classSync.printStr();
			System.out.println(threadName + "------���н���");
		}
	}
	
	public static void main(String[] args) {
		// �������ж������Ķ���
		ClassSync instancSync1 = new ClassSync();
		ClassSync instancSync2 = new ClassSync();
		
		// ���￪�����߳�����������������ͬ�Ķ��������߳���ͬʱ����
		TestThread testThread1 = new ClassSyncTest().new TestThread(instancSync1);
		TestThread testThread2 = new ClassSyncTest().new TestThread(instancSync2);
		
		// ��������Ķ�����ͬһ�����������̲߳���ͬʱ���У�һ���̵߳õ�����Ҫ�����߳��ͷ�������һ���̲߳��ܵõ���ȥ����
//		TestThread testThread1 = new classSyncTest().new TestThread(classSync1);
//		TestThread testThread2 = new classSyncTest().new TestThread(classSync1);
		
		testThread1.start();
		testThread2.start();
	}
	
}
