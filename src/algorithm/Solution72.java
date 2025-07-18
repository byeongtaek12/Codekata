package algorithm;

import java.util.*;

class Solution72 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] count = new int[N + 1];
		int length = stages.length;
		double[] percent = new double[N];

		for (int i = 0; i < stages.length; i++) {
			int stage = stages[i];
			if (stage <= N) {
				count[stage - 1] += 1;
			}
		}

		for (int i = 0; i < N; i++) {
			if (length == 0) {
				percent[i] = 0;
			} else {
				percent[i] = (double) count[i] / length;
			}
			length -= count[i];
		}

		List<double[]> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(new double[]{ i + 1, percent[i] });
		}

		list.sort((a, b) -> {
			int cmp = Double.compare(b[1], a[1]);
			if (cmp == 0) {
				return Double.compare(a[0], b[0]);
			} else {
				return cmp;
			}
		});

		for (int i = 0; i < N; i++) {
			answer[i] = (int) list.get(i)[0];
		}

		return answer;
	}
}

