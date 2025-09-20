package algorithm;

import java.util.*;
class Solution113 {
	public int solution(String s) {
		int n = s.length();
		if (n % 2 != 0) {
			return 0;
		}

		int answer = 0;
		for (int i = 0; i<n; i++) {
			String left = s.substring(i) + s.substring(0, i);
			if (isValid(left)) {
				answer++;
			}
		}
		return answer;
	}

	private boolean isValid(String left) {
		Deque<Character> stack = new ArrayDeque<>();
		for (char c : left.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char open = stack.pop();
				if (!match(open, c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean match(char open, char close) {
		if (open == '(' && close == ')') {
			return true;
		}

		if (open == '[' && close == ']') {
			return true;
		}

		if (open == '{' && close == '}') {
			return true;
		}
		return false;
	}
}
