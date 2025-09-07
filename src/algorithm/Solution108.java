package algorithm;

import java.util.*;

public class Solution108 {
	public int solution(int n) {
		int ans = 1;
		List<Integer> l = new ArrayList<>();

		while (n>1) {
			l.add(n%2);
			n /= 2;
		}

		for (Integer l1 : l) {
			if (l1 == 1) {
				ans++;
			}
		}

		return ans;
	}
}
