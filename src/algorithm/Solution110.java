package algorithm;

import java.util.*;
class Solution110{
	public int solution(int n, int a, int b) {
		int answer = 0;

		while (a != b) {
			a = holjjak(a);
			b = holjjak(b);
			answer++;
		}

		return answer;
	}

	private int holjjak (int x) {
		if (x % 2 == 0) {
			x /= 2;
		} else {
			x = (x + 1) / 2;
		}

		return x;
	}
}
