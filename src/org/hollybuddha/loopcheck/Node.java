package org.hollybuddha.loopcheck;

public class Node<T> {

	T value;
	public Node(T t) {
		value = t;
	}
	
	private Node<T> next;
	
	public T getValue(){
		return value;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	
	public void setNext(Node<T> next ){
		this.next = next;
	}
}
