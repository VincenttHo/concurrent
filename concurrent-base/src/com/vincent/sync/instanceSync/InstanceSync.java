package com.vincent.sync.instanceSync;

public class InstanceSync {

	/**
	 * 这是一个对象锁
	 * @Title:InstanceSync
	 * @Description:这是一个对象锁
	 * @author VincentHo
	 * @date 2019年3月30日
	 */
	public synchronized void printStr() {
		try {
			Thread.sleep(1000);
			System.out.println("运行对象锁方法。。。");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void other() {
		try {
			Thread.sleep(1000);
			System.out.println("rbq rbq。。。");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
