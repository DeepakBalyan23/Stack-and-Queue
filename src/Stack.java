
public class Stack<T> {

	private int top;
	private int capacity;
	private T [] arr;

	public Stack(int len) {
		arr = (T[])new Object[len];
		capacity = len;
		top=-1;
	}
	
	public int size() {
		return top+1;
	}
	
	public Boolean isEmpty() {
		return size()==0;
	}
	
	public Boolean isFull() {
		return size()==capacity;
	}
	
	public void push(T data) {
		if(size()==capacity) {
			throw new RuntimeException();
		} else {
			top++;
			arr[top] = data;
		}
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException();
		} else {
			T t = arr[top];
			arr[top] = null;
			top--;
			return t;
		}
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException();
		} else {
			T t = arr[top];
			return t;
		}
	}

	@Override
	public String toString() {
		StringBuilder res=new StringBuilder();
		res.append("[");
		if(size()>0) {
			res.append(arr[0]);
		}
		int i = 1;
		while(i<size() && arr[i]!=null) {
			res.append(", "+arr[i]);
			i++;
		}
		res.append("]");
		return res.toString();
	}
}
