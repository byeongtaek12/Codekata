package algorithm;

import java.util.*;
class Solution78 {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int[][] answer = {};

		Map<String, Integer> map = Map.of("code", 0, "date", 1, "maximum", 2, "remain", 3);

		int j = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i][map.get(ext)] < val_ext) {
				j++;
			}
		}

		answer = new int [j][data[0].length];


		int s = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i][map.get(ext)] < val_ext) {
				answer[s] = data[i];
				s++;
			}
		}

		int sortValue = map.get(sort_by);
		Arrays.sort(answer, (a,b) -> a[sortValue] - b[sortValue]);

		return answer;
	}
}
