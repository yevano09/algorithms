package org.hollybuddha.timer;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RunCommandatSpecificTime {

	public static void main(String... args) throws InterruptedException {
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
		
		Runnable task = new Runnable() {
			public void run() {
				System.out.println("Starting Task");
				Process p;
				int RetVal;
				try {
					p = Runtime.getRuntime().exec("Dir") ;
					RetVal = p.waitFor();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				scheduler.schedule(stopTask(), 500, TimeUnit.MILLISECONDS);
			}
		};
	
		scheduler.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
		Thread.sleep(3000);
		scheduler.shutdown();

	}
	
	private static Runnable stopTask(){
		final Thread taskThread = Thread.currentThread();
		return new Runnable() {

			@Override
			public void run() {
				  taskThread.interrupt();
				
			}
			
		};
	}

}
