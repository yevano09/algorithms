package org.hollybuddha.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FebonachiForkJoin extends RecursiveTask<Integer> {
		   final int n;
		   FebonachiForkJoin(int n) { this.n = n; }
		   public Integer compute() {
		     if (n <= 1)
		       return n;
		     FebonachiForkJoin f1 = new FebonachiForkJoin(n - 1);
		     f1.fork();
		     FebonachiForkJoin f2 = new FebonachiForkJoin(n - 2);
		     return f2.compute() + f1.join();
		   }
		   
		   
		   public static void main(String[] args) {
			   
			   ForkJoinPool pool = new ForkJoinPool();
			   
			   pool.invoke(new FebonachiForkJoin(10));
			   System.out.println();
		}
		 }