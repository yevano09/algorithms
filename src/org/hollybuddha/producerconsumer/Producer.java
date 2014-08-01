package org.hollybuddha.producerconsumer;

import java.util.Vector;

import org.hollybuddha.threads.ThreadLogger;

public class Producer implements Runnable {

	private final Vector<Integer> sharedQueue;
	private final int Size;

	public Producer(Vector<Integer> sharedque, int size) {
		sharedQueue = sharedque;
		Size = size;
	}

	@Override
	public void run() {
		// Responsible for producing data
		for (int i = 0; i < 10; i++) {
			try {
				ThreadLogger.threadMessage("Porduced " + i);

				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void produce(int i) throws InterruptedException {
		// Produce and notify all
		while (sharedQueue.size() == Size) {
			synchronized (sharedQueue) {
				ThreadLogger.threadMessage("Queue is full "
						+ sharedQueue.size());
				sharedQueue.wait();
			}

		}
		synchronized (sharedQueue) {
			sharedQueue.add(Integer.valueOf(i));
			sharedQueue.notifyAll();

		}

	}

}
