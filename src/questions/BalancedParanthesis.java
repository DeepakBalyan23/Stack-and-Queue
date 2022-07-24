package questions;

import java.util.HashMap;
import java.util.Map;

import main.Stack;

public class BalancedParanthesis {

	public Boolean isBalanced(String str) {
		Map<Character, Character> m = new HashMap<>();
		m.put(')', '(');
		m.put('}', '{');
		m.put(']', '[');
		Stack<Character> s = new Stack<>(str.length());
		for(char c : str.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				s.push(c);
			} else if(c==')' || c=='}' || c==']') {
				if(s.peek()==m.get(c)) {
					s.pop();
				} else {
					return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
