package main;

import java.util.Arrays;

import questions.BalancedParanthesis;
import questions.RainWaterTrapping;
import questions.SlidingWindowMaximum;

public class Main {

	public static void main(String[] args) {
//		Stack<Integer> s = new Stack<>(5);
//		s.push(10);
//		s.push(100);
//		s.push(8);
//		s.push(48);
//		s.push(83);
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s);
//		System.out.println(s.peek());
//		System.out.println(s);
		
//		Queue<Integer> q = new Queue<>();
//		q.offer(4);
//		q.offer(10);
//		q.offer(42);
//		q.offer(72);
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);
		
//		BalancedParanthesis b = new BalancedParanthesis();
//		System.out.println(b.isBalanced("[]"));
		
//		RainWaterTrapping r = new RainWaterTrapping();
//		System.out.println(r.totalWaterUsingStack(new int[]{2,1,0,4,10,0,0,10}));
		
		SlidingWindowMaximum s =  new SlidingWindowMaximum();
		System.out.println(Arrays.toString(s.maxElements(new int[] {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, 4)));
	}

}
