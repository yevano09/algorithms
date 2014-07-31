package org.hollybuddha.deadlock;

public class DeadlockExample {

	private final Object left = new Object();
	private final Object right = new Object();

	class A implements Runnable {
		public void leftRight() {
			System.out.println(" Left Right - start");
			synchronized (left) {
				System.out.println(" Left Right - syncLeft");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					return;
				}
				synchronized (right) {
					System.out.println(" Left Right - syncLeftRight");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(" Left Right - End");
				}
			}
		}

		@Override
		public void run() {
			leftRight();

		}
	}

	class B implements Runnable {

		public void Rightleft() {
			System.out.println(" Right Left -- start");
			synchronized (left) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					return;
				}

				System.out.println(" Right Left - syncLeft");
				synchronized (right) {
					System.out.println(" Right Left - syncLeftRight");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(" Right Left  -- End");
				}
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Rightleft();
		}
	}

	public static void main(String[] args) {
		DeadlockExample ex = new DeadlockExample();
		Thread t1 = (new Thread(ex.new A())); 
		
		Thread t2 =(new Thread(ex.new B()));
		t2.start();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
