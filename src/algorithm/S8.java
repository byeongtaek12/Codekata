package algorithm;

import java.util.*;
class S8 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};
		Map<String,Integer> map = new HashMap<>();
		int i = 0;
		int [] aa = new int [privacies.length];
		int y;
		int m;
		int d;
		int ty;
		int tm;
		int td;

		for (String term : terms) {
			String[] t = term.split(" ");
			map.put(t[0], Integer.valueOf(t[1]));
		}

		String[] t = today.split("\\.");
		ty = Integer.valueOf(t[0]);
		tm = Integer.valueOf(t[1]);
		td = Integer.valueOf(t[2]);

		for (String privacy : privacies) {
			String[] p = privacy.split(" ");
			String[] p1 = p[0].split("\\.");
			if (Integer.valueOf(p1[1]) + map.get(p[1]) > 12) {
				y = Integer.valueOf(p1[0]) + (Integer.valueOf(p1[1]) + map.get(p[1]) - 1) / 12;
				m = (Integer.valueOf(p1[1]) + map.get(p[1]) - 1) % 12 + 1;
				if (Integer.valueOf(p1[2]) - 1 == 0) {
					d = 28;
					if (m == 1) {
						m = 12;
						y = y - 1;
					} else {
						m -= 1;
					}
				}else {
					d = Integer.valueOf(p1[2]) - 1;
				}
			} else {
				y = Integer.valueOf(p1[0]);
				m = Integer.valueOf(p1[1]) + map.get(p[1]);
				if (Integer.valueOf(p1[2]) - 1 == 0) {
					d = 28;
					if (m == 1) {
						m = 12;
						y = y - 1;
					} else {
						m -= 1;
					}
				}else {
					d = Integer.valueOf(p1[2]) - 1;
				}
			}

			if (y < ty) {
				aa[i] += 1;
				i++;
				continue;
			}

			if (y == ty && m < tm) {
				aa[i] += 1;
				i++;
				continue;
			}

			if (y == ty && m == tm && d < td) {
				aa[i] += 1;
			}
			i++;
		}

		int oneCnt = 0;
		for (int j = 0; j<aa.length; j++) {
			if (aa[j] == 1) {
				oneCnt++;
			}
		}

		answer = new int[oneCnt];
		int idx = 0;

		for (int k = 0; k<aa.length; k++) {
			if (aa[k] == 1) {
				answer[idx] = k + 1;
				idx++;
			}
		}

		return answer;
	}
}
