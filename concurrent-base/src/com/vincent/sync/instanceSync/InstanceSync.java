package com.vincent.sync.instanceSync;

public class InstanceSync {

	/**
	 * ����һ��������
	 * @Title:InstanceSync
	 * @Description:����һ��������
	 * @author VincentHo
	 * @date 2019��3��30��
	 */
	public synchronized void printStr() {
		try {
			Thread.sleep(1000);
			System.out.println("���ж���������������");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void other() {
		try {
			Thread.sleep(1000);
			System.out.println("rbq rbq������");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
