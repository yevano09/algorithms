package org.hollybuddha.deadlock;

public class DeadlockExample {

	private final Object left = new Object();
	private final Object right = new Object();

	public class A implements Runnable {
		public void leftRight() {
			System.out.println(" Left Right - start");
			synchronized (left) {
				System.out.println(" Left Right - syncLeft");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				synchronized (right) {
					System.out.println(" Left Right - syncLeftRight");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(" Left Right");
				}
			}
		}

		@Override
		public void run() {
			leftRight();

		}
	}

	public class B implements Runnable {

		public void Rightleft() {
			System.out.println(" Right Left - start");
			synchronized (right) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				System.out.println(" Right Left - syncLeft");
				synchronized (left) {
					System.out.println(" Right Left - syncLeftRight");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(" Right Left ");
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
		(new Thread(ex.new A())).start();
		(new Thread(ex.new B())).start();
	}
}
