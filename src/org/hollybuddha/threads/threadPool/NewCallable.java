package org.hollybuddha.threads.threadPool;

import java.util.concurrent.Callable;

public class NewCallable implements Callable<Long> {

	@Override
	public Long call() throws Exception {

		long sum = 0;
		for (long i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
}
