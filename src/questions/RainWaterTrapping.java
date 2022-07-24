package questions;

import main.Stack;

public class RainWaterTrapping {

	public int totalWater(int[] a) {
		if(a.length<3) {
			return 0;
		}
		int n = a .length;
		int [] left = new int[n];
		left[0]= a[0];
		int [] right = new int[n];
		right[n-1] = a[n-1];
		
		for(int i=1; i<n;i++) {
			if(left[i-1]<a[i]) {
				left[i]=a[i];
			} else {
				left[i] = left[i-1];
			}
		}
		
		for(int i=n-2; i>=0;i--) {
			if(right[i+1]<a[i]) {
				right[i]=a[i];
			} else {
				right[i]=right[i+1];
			}
		}
		int res = 0;
		for(int i=1; i<n-1;i++) {
			int sum = Math.min(left[i], right[i]) - a[i];
			res+=sum;
		}
		return res;
	}
	
	public int totalWaterUsingStack(int[] a) {
		int len = a.length;
		Stack<Integer> s = new Stack<>(len);
		int res=0;
		for(int i=0; i<len;i++) {
			while(!s.isEmpty() && a[i]>a[s.peek()]) {
				int t = a[s.pop()];
				if (s.isEmpty())
                    break;
				int dis = i-s.peek()-1;
				int bH = Math.min(a[i], a[s.peek()])-t;
				res+=bH*dis;
				
			}
			s.push(i);
		}
		return res;
	}
}
