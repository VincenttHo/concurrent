package com.vincent.usethread;

public class ImplRunnable implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("threadName:-------" + threadName);
	}
	
	public static void main(String[] args) {
		for(int n = 0; n < 5; n++) {
			new Thread(new ImplRunnable()).start();
		}
	}

}
