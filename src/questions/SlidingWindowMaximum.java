package questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
	
	public int[] maxElements(int arr[], int k){
		int[] res = new int[arr.length-k+1];
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=0; i<k;i++) {
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
				q.pollLast();
			}
			q.offerLast(i);
		}
		res[0] = arr[q.peekFirst()];
		while ((!q.isEmpty()) && q.peek() <= 0)
			q.removeFirst();
		for(int i = k; i<arr.length; i++) {
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
				q.pollLast();
			}
			q.offerLast(i);
			res[i-k+1] = arr[q.peekFirst()];
			while ((!q.isEmpty()) && q.peek() <= i-k+1)
				q.removeFirst();
		}
		return res;
	}
}
