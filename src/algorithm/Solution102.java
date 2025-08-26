package algorithm;

import java.util.*;
class Solution102 {
	public int solution(int n) {
		int answer = 0;
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(1);

		for (int i = 2; i<=n; i++) {
			int ad = (l.get(i-2) + l.get(i-1)) % 1234567;
			l.add(ad);
		}

		answer = l.get(n);

		return answer;
	}
}
