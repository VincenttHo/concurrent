package com.vincent.sync.classSync;

public class ClassSync {

	/**
	 * ����һ������
	 * @Title:InstanceSync
	 * @Description:����һ��������
	 * @author VincentHo
	 * @date 2019��3��30��
	 */
	public synchronized static void printStr() {
		try {
			Thread.sleep(1000);
			System.out.println("������������������");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
