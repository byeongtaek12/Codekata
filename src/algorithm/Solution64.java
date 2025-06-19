package algorithm;

import java.util.*;
class Solution64 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i<lost.length; i++) {
			for (int j = 0; j<reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = 0;
					reserve[j] = 0;
					break;
				}
			}
		}
		for (int i = 0; i<lost.length; i++) {
			for (int j = 0; j<reserve.length; j++) {
				if (lost[i]==0 || reserve[j] == 0) {
					continue;
				}
				if (lost[i] -1 == reserve[j] || lost[i] + 1 == reserve[j]  ) {
					lost[i] = 0;
					reserve[j] = 0;
					break;
				}
			}
		}
		int lostCount = 0;
		for (int lost1 : lost) {
			if (lost1 != 0) {
				lostCount++;
			}
		}
		answer = n - lostCount;

		return answer;
	}
}
