package algorithm;

import java.util.*;
class Solution81 {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		Map<Integer,int[]> map = Map.of(1,new int[]{0,0},
			2,new int[]{0,1},
			3,new int[]{0,2},
			4,new int[]{1,0},
			5,new int[]{1,1},
			6,new int[]{1,2},
			7,new int[]{2,0},
			8,new int[]{2,1},
			9,new int[]{2,2},
			0,new int[]{3,1}
		);
		int[] left = new int[]{3,0};
		int[] right = new int[]{3,2};

		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) {
				left = map.get(n);
				sb.append("L");
			} else if (n == 3 || n == 6 || n == 9) {
				sb.append("R");
				right = map.get(n);
			} else {
				int leftDist = Math.abs(left[0] - map.get(n)[0]) + Math.abs(left[1] - map.get(n)[1]);
				int rightDist = Math.abs(right[0] - map.get(n)[0]) + Math.abs(right[1] - map.get(n)[1]);

				if (leftDist == rightDist) {
					if (hand.equals("right")) {
						sb.append("R");
						right = map.get(n);
					} else {
						sb.append("L");
						left = map.get(n);
					}
				} else if (leftDist > rightDist) {
					sb.append("R");
					right = map.get(n);
				} else {
					sb.append("L");
					left = map.get(n);
				}
			}
		}
		answer = sb.toString();
		return answer;
	}
}
