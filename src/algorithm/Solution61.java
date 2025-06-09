package algorithm;

import java.util.*;

class Solution61 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int matchCount = 0;
		int zeroCount = 0;

		for (int lotto : lottos) {
			if (lotto == 0) {
				zeroCount++;
				continue;
			}
			for (int win_num : win_nums) {
				if (lotto == win_num) {
					matchCount++;
					break;
				}
			}
		}

		answer[0] = getRank(matchCount + zeroCount);
		answer[1] = getRank(matchCount);

		return answer;
	}

	private int getRank(int count) {
		return count >= 2 ? 7 - count : 6;
	}
}

