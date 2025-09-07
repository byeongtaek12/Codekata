package algorithm;

import java.util.*;
class Solution109 {
	public int solution(int[] elements) {
		int answer = 0;
		Set<Integer> s = new HashSet<>();

		for (int i = 1; i<=elements.length; i++) {
			for (int j = 0; j<elements.length; j++) {
				int sum = 0;
				for (int k = 0; k<i; k++) {
					sum += elements[(j+k) % elements.length];
				}
				s.add(sum);
			}
		}

		answer = s.size();

		return answer;
	}
}
