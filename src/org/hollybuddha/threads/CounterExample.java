package org.hollybuddha.threads;

public class CounterExample {
	Counter c = new Counter();
	
	public void printCounter(){
		c.value();
	}
	
	class CountIncrement implements Runnable{
		
		public void run() {
			c.increment();
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				return;
//			} finally{
//				ThreadLogger.threadMessage("In Finally - ");
//				c.value();
//			}
		};
		
	};
	class CountDecrement implements Runnable{
		
		public void run() {
			c.decrement();
		};
		
	};
	public static void main(String[] args) {
		CounterExample ex = new CounterExample();
		try{
		for(int i = 1; i <= 10 ; i++){
		(new Thread(ex.new CountIncrement())).start();
		}
		for(int i = 1; i <= 10 ; i++){
			(new Thread(ex.new CountDecrement())).start();
			}
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		finally{
		ex.printCounter();
		}
		
		
	}

}
