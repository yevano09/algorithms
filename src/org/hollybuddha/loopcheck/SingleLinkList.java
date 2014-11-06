package org.hollybuddha.loopcheck;

import java.util.Objects;

public class SingleLinkList<V> {
	
	private Node<V> start;
	
	public void add(V val){
		Node<V> node = new Node<V>(val);
		if( Objects.isNull(start)){
			start = node;
		}else {
			Node<V> temp = start;
			while(!Objects.isNull(temp.getNext()) ){
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		
		}
	public Node<V> getStart(){
		return start;
	}

}
