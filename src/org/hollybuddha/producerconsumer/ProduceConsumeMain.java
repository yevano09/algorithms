package org.hollybuddha.producerconsumer;

import java.util.Vector;

public class ProduceConsumeMain {

	public static void main(String[] args) {

		Vector<Integer> sharedQue = new Vector<Integer>();
		
		int size = 5;
		
		Thread prodThread = new Thread(new Producer(sharedQue, size));
		Thread consuThread = new Thread(new Consumer(sharedQue, size));
		prodThread.start();
		consuThread.start();
		
		

	}

}
