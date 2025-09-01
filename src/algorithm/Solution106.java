package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution106 {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		List<Integer> l = new ArrayList<>();
		int same = tangerine[0];
		int count = 0;

		Arrays.sort(tangerine);

		for (int i = 0; i<tangerine.length; i++) {
			if (tangerine[i] == same) {
				count++;
			} else {
				l.add(count);
				count = 1;
				same = tangerine[i];
			}
		}
		l.add(count);

		int max = 0;
		for (int j = 0; j < l.size(); j++) {
			if (l.get(j) > max) {
				max = l.get(j);
			}
		}

		if (max >= k) {
			answer = 1;
		} else {
			while (k > 0) {
				if (l.indexOf(max) != -1) {
					k -= max;
					answer++;
					l.remove(l.indexOf(max));
				} else {
					max--;
				}
			}
		}

		return answer;
	}
}
