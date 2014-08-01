package org.hollybuddha.threads;
class Counter {
    private int c = 0;

    synchronized
    public void  increment() {
        ThreadLogger.threadMessage("increment Value of c = " + Integer.toString(c++));
        value();
    }

    synchronized  
    public void decrement() {
        
        ThreadLogger.threadMessage("decrement Value of c = " + Integer.toString(c--));
        value();
    }

    synchronized 
    public int value() {
    	ThreadLogger.threadMessage(" Value of c = " + Integer.toString(c));
        return c;
    }

}
