package algorithm;

import java.util.*;

class Solution88 {
	public int solution(int[] mats, String[][] park) {
		int answer = -1;
		List<int[]> l = new ArrayList<>();

		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length; j++) {
				if (park[i][j].equals("-1")) {
					l.add(new int[]{i, j});
				}
			}
		}

		int[][] directions = {
			{0, 1},
			{1, 0},
			{0, -1}
		};

		int maxCount = 0;

		for (int[] start : l) {
			int count = 0;

			while (true) {
				boolean isValid = true;

				for (int i = 1; i <= count; i++) {
					int x = start[0];
					int y = start[1] + i;
					if (!inBounds(x, y, park) || !park[x][y].equals("-1")) {
						isValid = false;
						break;
					}
				}
				if (!isValid) break;

				for (int i = 1; i <= count; i++) {
					int x = start[0] + i;
					int y = start[1] + count;
					if (!inBounds(x, y, park) || !park[x][y].equals("-1")) {
						isValid = false;
						break;
					}
				}
				if (!isValid) break;

				for (int i = 1; i <= count; i++) {
					int x = start[0] + count;
					int y = start[1] + count - i;
					if (!inBounds(x, y, park) || !park[x][y].equals("-1")) {
						isValid = false;
						break;
					}
				}
				if (!isValid) break;

				count++;
			}

			maxCount = Math.max(maxCount, count);
		}

		Arrays.sort(mats);
		for (int m : mats) {
			if (maxCount >= m) {
				answer = m;
			}
		}

		return answer;
	}

	private boolean inBounds(int x, int y, String[][] park) {
		return x >= 0 && x < park.length && y >= 0 && y < park[0].length;
	}
}
