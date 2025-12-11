package algorithm;

import java.util.*;
class S9 {
	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> m = new HashMap<>();

		int idx = 0;

		while (discount.length - 10 >= idx) {
			for (int s = 0; s<want.length; s++) {
				m.put(want[s], number[s]);
			}

			for (int j = idx; j < idx + 10; j++) {
				if (m.containsKey(discount[j])) {
					if (m.get(discount[j]) > 0) {
						m.compute(discount[j], (k,v) -> v - 1);
					}
				}
			}

			boolean flag = true;

			for (Integer v : m.values()) {
				if (v != 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				answer++;
			}
			idx++;
		}

		return answer;
	}
}