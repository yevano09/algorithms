package org.hollybuddha.threads.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

		  private static final int NTHREDS = 2;

		  public static void main(String[] args) {

		    ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		    List<Future<Long>> list = new ArrayList<Future<Long>>();
		    for (int i = 0; i < 20; i++) {
		      Callable<Long> worker = new NewCallable();
		      Future<Long> submit = executor.submit(worker);
		      list.add(submit);
		      System.out.println("==----"+ (i +1) +" -----===");
		    }
		    long sum = 0;
		    System.out.println(list.size());
		    // now retrieve the result
		    for (Future<Long> future : list) {
		      try {
		        sum += future.get();
		        System.out.println(sum + future.toString());    
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      } catch (ExecutionException e) {
		        e.printStackTrace();
		      }
		    }
		    System.out.println(sum);
		    executor.shutdown();
		  }
		}