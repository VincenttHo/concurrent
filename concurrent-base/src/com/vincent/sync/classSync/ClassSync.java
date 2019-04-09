package com.vincent.sync.classSync;

public class ClassSync {

	/**
	 * 这是一个类锁
	 * @Title:InstanceSync
	 * @Description:这是一个对象锁
	 * @author VincentHo
	 * @date 2019年3月30日
	 */
	public synchronized static void printStr() {
		try {
			Thread.sleep(1000);
			System.out.println("运行类锁方法。。。");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
