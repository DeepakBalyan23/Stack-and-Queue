package main;

public class Queue<T> {

	private int length;
	public Node<T> head;
	public Node<T> tail;
	
	public Queue() {
		length = 0;
	}
	
	public Boolean isEmpty() {
		return length==0;
	}
	
	public void offer(T data) {
		Node<T> n = new Node<>(data);
		if(isEmpty()) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		length++;
	}
	
	public T poll() {
		if(isEmpty()) {
			throw new RuntimeException();
		} else{
			Node<T> n = head;
			head = head.next;
			n.next = null;
			length--;
			return n.data;
		}
	}

	@Override
	public String toString() {
		StringBuilder res=new StringBuilder();
		if(head==null) {
			return "";
		}
		Node<T> n = head;
		while(n.next!=null) {
			res.append(n.data + " -> ");
			n = n.next;
		}
		res.append(n.data);
		return res.toString();
	}
	
}
