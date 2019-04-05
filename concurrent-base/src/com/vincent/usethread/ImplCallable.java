package com.vincent.usethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ImplCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("threadName:-------" + threadName);
		return threadName;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String> futureTask1 = new FutureTask<>(new ImplCallable());
		FutureTask<String> futureTask2 = new FutureTask<>(new ImplCallable());
		FutureTask<String> futureTask3 = new FutureTask<>(new ImplCallable());
		FutureTask<String> futureTask4 = new FutureTask<>(new ImplCallable());
		FutureTask<String> futureTask5 = new FutureTask<>(new ImplCallable());
		new Thread(futureTask1).start();
		new Thread(futureTask2).start();
		new Thread(futureTask3).start();
		new Thread(futureTask4).start();
		new Thread(futureTask5).start();
		System.out.println(futureTask1.get());
		System.out.println(futureTask2.get());
		System.out.println(futureTask3.get());
		System.out.println(futureTask4.get());
		System.out.println(futureTask5.get());
	}

}
