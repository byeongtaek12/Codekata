package algorithm;

import java.util.*;
class Solution84 {
	public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = 0;
		int n = schedules.length;
		boolean[] anyone = new boolean[n];

		for (int i = 0; i<n; i++) {
			for (int j = 0; j<timelogs[0].length; j++) {
				int time = schedules[i] % 100 + 10 >= 60 ? schedules[i] + 50 : schedules[i] + 10;
				if (time < timelogs[i][j]) {
					if ((startday + j) % 7 != 6 && (startday + j) % 7 != 0) {
						anyone[i] = true;
						break;
					}
				}
			}
		}

		int count = n;
		for (boolean a : anyone) {
			if (a) {
				count--;
			}
		}
		answer = count;
		return answer;
	}
}
