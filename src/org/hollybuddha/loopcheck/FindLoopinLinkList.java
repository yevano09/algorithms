package org.hollybuddha.loopcheck;

public class FindLoopinLinkList {

	    public static void main(String args[]) {
	 
	    	FindLoopinLinkList finder = new FindLoopinLinkList();
	 
	        SingleLinkList<Integer> sampleList = new SingleLinkList<>();
	        // First Insert randomly ten elements in a linked list
	        for (int i = 0; i < 10; i++) {
	            sampleList.add(i);
	        }
	 
	        System.out.println("Loop Existence : " + finder.doesLoopExist(sampleList));
	        System.out.println("Loop Existence : " + finder.doesLoopExist(finder.createLoop(sampleList)));
	    }
	 
	    public boolean doesLoopExist(SingleLinkList<Integer> listToCheck) {
	    	Node<Integer> tortoise = listToCheck.getStart();
	    	Node<Integer> hare = listToCheck.getStart();
	 
	        try {
	            while (true) {
	                tortoise = tortoise.getNext();
	                hare = hare.getNext().getNext();
	                if (tortoise == hare) {
	                    return true;
	                }
	            }
	        } catch (NullPointerException ne) {
	            return false;
	        }
	    }
	 
	    private SingleLinkList createLoop(SingleLinkList sampleList) {
	        sampleList.getStart().getNext().getNext().getNext().setNext(sampleList.getStart().getNext());
	        return sampleList;
	    }
	}
