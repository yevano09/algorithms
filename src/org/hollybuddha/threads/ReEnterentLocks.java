package org.hollybuddha.threads;

public class ReEnterentLocks {
	
	
	Object LockObj = new Object();
	
	public void methordA(){
		synchronized (LockObj) {
			methordB();
		}
	}

	private void methordB() {
		synchronized (LockObj) {
			ThreadLogger.threadMessage("Reenterant Lock done successfully");

		}

		
	}

	public static void main(String[] args) {
		ReEnterentLocks loc = new ReEnterentLocks();
		loc.methordA();
		
	}
}
