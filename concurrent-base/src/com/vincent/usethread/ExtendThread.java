package com.vincent.usethread;

public class ExtendThread extends Thread {

	@Override
	public void run() {
		String threadName = this.getName();
		System.out.println("threadName:-------" + threadName);
	}
	
	public static void main(String[] args) {
		for(int n = 0; n < 5; n++) {
			new ExtendThread().start();
		}
	}
	
}
