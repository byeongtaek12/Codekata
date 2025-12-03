package algorithm;

import java.util.*;
class S4 {
	public int solution(int[][] sizes) {
		int answer = 0;

		for (int[] size : sizes) {
			Arrays.sort(size);
		}

		int max0 = sizes[0][0];
		int max1 = sizes[0][1];

		for (int[] s : sizes) {
			if (s[0] > max0) {
				max0 = s[0];
			}

			if (s[1] > max1) {
				max1 = s[1];
			}
		}

		answer = max0 * max1;


		return answer;
	}
}
