package org.hollybuddha.producerconsumer;

import java.util.Vector;

import org.hollybuddha.threads.ThreadLogger;

public class Consumer implements Runnable {

	private final Vector<Integer> sharedQueue;
	private final int Size; 
	
	
	public Consumer(Vector<Integer> sharedque, int size) {
		sharedQueue = sharedque;
		Size = size;
	}
	
	@Override
	public void run() {
	
		while(true){
			try {
				ThreadLogger.threadMessage("Consumed : "+ consume());
				Thread.sleep(50);
			}
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
			
		}
		
	}

	private String consume() throws InterruptedException {
		// wait if queue is empty 
		while ( sharedQueue.isEmpty()){
			synchronized (sharedQueue) {
				
				ThreadLogger.threadMessage("Queue is empty hence waiting"  );
				sharedQueue.wait();
			}
		}
		// The shared queue is not Empty hence consume 
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return sharedQueue.remove(0).toString();
			
		}

	}
	
	

}
